package com.app.eschool.app.adapter;

import java.util.ArrayList;
import java.util.List;

import com.app.eschool.app.util.DebugUtils;
import com.eschool.app.Constant;
import com.eschool.app.R;
import com.eschool.app.domain.Exam;
import com.eschool.app.school.others.LoadUserAvatar;
import com.eschool.app.school.others.LoadUserAvatar.ImageDownloadedCallBack;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

public class ExamAdapter extends ArrayAdapter<Exam> implements SectionIndexer {

	public static final String TAG = "ExamAdapter";
	
	List<String> list;
    List<Exam> userList;
    List<Exam> copyUserList;
    private LayoutInflater layoutInflater;
    private SparseIntArray positionOfSection;
    private SparseIntArray sectionOfPosition;
    private int res;
    public MyFilter myFilter;
    private LoadUserAvatar avatarLoader;
    
	public ExamAdapter(Context context, int resource, List<Exam> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		
		this.res = resource;
		this.userList = objects;
		copyUserList = new ArrayList<Exam>();
		copyUserList.addAll(objects);
		
		layoutInflater = LayoutInflater.from(context);
        avatarLoader = new LoadUserAvatar(context, "/sdcard/eschool/");
        
        Log.d(TAG, "构造");
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {	
		if( convertView == null ){
			convertView = layoutInflater.inflate(res, null);		
		}
		
		ImageView iv_avatar = (ImageView) convertView.findViewById(R.id.iv_avatar);
		if( null == iv_avatar ){			
			Log.d(TAG, "iv_avatar 不存在");
		}
		
        TextView nameTextview = (TextView) convertView.findViewById(R.id.tv_name);
        if( null == nameTextview ){			
        	Log.d(TAG, "nameTextview 不存在");
		}
        
        TextView tvHeader = (TextView) convertView.findViewById(R.id.header);
        if( null == tvHeader ){			
        	Log.d(TAG, "tvHeader 不存在");
		}
        
        View view_temp = (View) convertView.findViewById(R.id.view_temp);
        if( view_temp == null ) 
        {
        	Log.d(TAG, "view 不存在");
        }
        
        Exam user = getItem(position);
        if (user == null)
        {
        	Log.d(TAG, "user == null");
        }
        else
        {
        	Log.d(TAG, "Name:"+user.getName() + "postion: "+ String.valueOf(position) );
        }
        
        // 设置nick，demo里不涉及到完整user，用username代替nick显示
        String header = user.getHeader();//是否分专业
        String usernick = user.getName();
        //String useravatar = user.getName();
        String useravatar = "test";
        if ( position == 0 || 
        	 header != null && 
        	 !header.equals(getItem(position - 1).getHeader())) {
           
        	if ("".equals(header) || header.length() <= 0 ) {
        		//如果专业为空：
        		//tvHeader.setHeight(0);                              
                view_temp.setVisibility(View.VISIBLE);
                tvHeader.setVisibility(View.GONE); 
            } else {
            	//如果专业不为空:设置背景可见，设置文本            	
            	tvHeader.setVisibility(View.VISIBLE);
                tvHeader.setText(header);//专业名称
                view_temp.setVisibility(View.GONE);
            }
        	
        } else {
            tvHeader.setVisibility(View.GONE);
            view_temp.setVisibility(View.VISIBLE);
        }
        // 显示申请与通知item


        nameTextview.setText(usernick);
        iv_avatar.setImageResource(R.drawable.a_a);
        showUserAvatar(iv_avatar, useravatar);
		return convertView;
	}

	@Override
    public Exam getItem(int position) {
		Log.d(TAG, "position : " + String.valueOf(position));
        return super.getItem(position);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
	
	@Override
	public int getPositionForSection(int section) {
		// TODO Auto-generated method stub
		return positionOfSection.get(section);		
	}

	@Override
	public int getSectionForPosition(int position) {
		// TODO Auto-generated method stub
		return sectionOfPosition.get(position);
	}

	@Override
	public Object[] getSections() {
		// TODO Auto-generated method stub
		positionOfSection = new SparseIntArray();
        sectionOfPosition = new SparseIntArray();
        int count = getCount();
        list = new ArrayList<String>();
        list.add(getContext().getString(R.string.search_header));
        positionOfSection.put(0, 0);
        sectionOfPosition.put(0, 0);
        for (int i = 1; i < count; i++) {

            String letter = getItem(i).getHeader();
            System.err.println("contactadapter getsection getHeader:" + letter
                    + " name:" + getItem(i).getName());
            int section = list.size() - 1;
            if (list.get(section) != null && !list.get(section).equals(letter)) {
                list.add(letter);
                section++;
                positionOfSection.put(section, i);
            }
            sectionOfPosition.put(i, section);
        }
        return list.toArray(new String[list.size()]);
	}

	
	public Filter getFilter(){
		if( myFilter == null ){
			myFilter = new MyFilter(userList);
		}
		
		return myFilter;
	}
	
	private class MyFilter extends Filter {
		List<Exam> mList = null;
		
		
		public MyFilter(List<Exam> myList){
			super();
			this.mList = myList;
		}
		
		@Override
		protected synchronized FilterResults performFiltering(CharSequence prefix) {
			// TODO Auto-generated method stub
			
			FilterResults results = new FilterResults();
            if (mList == null) {
                mList = new ArrayList<Exam>();
            }
            
            if (prefix == null || prefix.length() == 0) {
                results.values = copyUserList;
                results.count = copyUserList.size();
            } else {
            	String prefixString = prefix.toString();
                final int count = mList.size();
                final ArrayList<Exam> newValues = new ArrayList<Exam>();
                for (int i = 0; i < count; i++) {
                    final Exam user = mList.get(i);
                    String username = user.getName();     

                    if (username.startsWith(prefixString)) {
                        newValues.add(user);
                    } else {
                        final String[] words = username.split(" ");
                        final int wordCount = words.length;

                        // Start at index 0, in case valueText starts with
                        // space(s)
                        for (int k = 0; k < wordCount; k++) {
                            if (words[k].startsWith(prefixString)) {
                                newValues.add(user);
                                break;
                            }
                        }
                    }
                }
                results.values = newValues;
                results.count = newValues.size();
            }
            
            return results;
		}

		@SuppressWarnings("unchecked")
		@Override
		protected synchronized void publishResults(CharSequence constraint, FilterResults results) {
			// TODO Auto-generated method stub
			userList.clear();
            userList.addAll((List<Exam>) results.values);
            if (results.count > 0) {
                notifyDataSetChanged();
            } else {
                notifyDataSetInvalidated();
            }
		}		
	}
	
	/*
	 * 头像
	 * String avatar：头像
	 */
	private void showUserAvatar(ImageView iamgeView, String avatar) {
        if(avatar==null||avatar.equals("")) return;
        final String url_avatar = Constant.URL_Avatar + avatar;
        iamgeView.setTag(url_avatar);
        if (url_avatar != null && !url_avatar.equals("")) {
            Bitmap bitmap = avatarLoader.loadImage(iamgeView, url_avatar,
                    new ImageDownloadedCallBack() {

                        @Override
                        public void onImageDownloaded(ImageView imageView,
                                Bitmap bitmap) {
                            if (imageView.getTag() == url_avatar) {
                                imageView.setImageBitmap(bitmap);

                            }
                        }

                    });
            if (bitmap != null)
                iamgeView.setImageBitmap(bitmap);

        }
    }

	

}
