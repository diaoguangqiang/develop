package com.eschool.app.school;

import com.eschool.app.R;
import com.eschool.app.widget.ExamGridView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.AdapterView.OnItemClickListener;

/*
 * 菜单：题库
 */
public class FragmentFriends extends Fragment {

    private ExamGridView gridView;
    private final static String[] names = new String[] { "刷卡", "转账", "手机充值",
            "理财通", "滴滴出行", "生活缴费", "电影票", "美丽说", "京东精选", "信用卡还款", "微信红包",
            "火车票机票", "吃喝玩乐", "腾讯公益", "AA收款" };
    private final static int[] images = new int[] { R.drawable.w1,
            R.drawable.w2, R.drawable.w3, R.drawable.w4, R.drawable.w5,
            R.drawable.w6, R.drawable.w7, R.drawable.w8, R.drawable.w9,
            R.drawable.w10, R.drawable.w11, R.drawable.w12, R.drawable.w13,
            R.drawable.w14, R.drawable.w15 };
    private Myadapter adapter;

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(com.eschool.app.R.layout.fragment_exam_bank, container, false);
    }

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		 // 防止被T后，没点确定按钮然后按了home键，长期在后台又进app导致的crash
        /*if (savedInstanceState != null
                && savedInstanceState.getBoolean("isConflict", false))
            return;
         */
        initView();
	}
	
	private void initView(){
		gridView = (ExamGridView) getView().findViewById(R.id.gv_exam_gridview);
        	
		adapter = new Myadapter( images, names);
        gridView.setAdapter(adapter);
        /*gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
            	
            }

        });
        */
        
		return;
	}
	
	class Myadapter extends BaseAdapter {

		private LayoutInflater inflater;
		private int[] imageDatas;
		private String[] nameDatas;

		
		public Myadapter( /*Context context,*/ int[] imageDatas, String[] nameDatas) {
			// TODO Auto-generated constructor stub
			//inflater = LayoutInflater.from(context);

            this.imageDatas = imageDatas;
            this.nameDatas = nameDatas;

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return imageDatas.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return imageDatas[position];
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}
