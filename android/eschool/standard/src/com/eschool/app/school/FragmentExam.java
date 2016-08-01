package com.eschool.app.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.app.eschool.app.adapter.ExamAdapter;

import com.eschool.app.MYApplication;
import com.eschool.app.R;
import com.eschool.app.activity.ProfessionListActivity;
import com.eschool.app.domain.Exam;
import com.eschool.app.school.others.LoadDataFromServer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class FragmentExam extends Fragment {

	public static final String TAG = "FragmentExam";
	
	private List<Exam> examList;
	private ListView listView;
	private TextView tv_total;	//题库数量
	private LayoutInflater infalter;
	
	//适配器
	private ExamAdapter adapter;

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(com.eschool.app.R.layout.fragment_exam, container, false);
    }

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

		initView();
	}
	
	private void initView(){
		listView = (ListView) getView().findViewById(com.eschool.app.R.id.lv_exam_list);
	    if( null == listView ){
	    	Log.d(TAG, "列表为空!");
	    	//DebugUtils.printFileNameAndLinerNumber("列表为空");
	    }
		
		examList = new ArrayList<Exam>();
		
		// 获取设置contactlist
        getExamList();
        
		infalter=LayoutInflater.from(getActivity());
		
		View headView = infalter.inflate(R.layout.item_exam_list_head, null);
        listView.addHeaderView(headView);       
        
        //View footerView = infalter.inflate(R.layout.item_exam_list_footer, null);        
        //listView.addFooterView(footerView);
        
        //tv_total = (TextView) getView().findViewById(R.id.tv_total);
        
        // 设置adapter
        adapter = new ExamAdapter(getActivity(), R.layout.item_exam_list, examList);
        if( adapter == null ){
        	Log.d(TAG, "ExamAdapter 失败");
        }
        listView.setDividerHeight(0);
        listView.setAdapter(adapter);
        
        
        listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				
				//Log.d(TAG, "点击题库" );
				if(position!=0&&position!=examList.size()+1){
					
					Exam exam = examList.get( position - 1 );
					
	                startActivity(new Intent(getActivity(), ProfessionListActivity.class)
	                    .putExtra("id", exam.getId() ).putExtra("name", exam.getName()).putExtra("header", exam.getHeader()));	 
					
					// 获取点击RelativeLayout中的内容信息
	        		String text = "暂未开放:" + String.valueOf(exam.getId())+" "+exam.getName();
					// 弹出Toast信息显示点击位置和内容
	        		Toast.makeText( getActivity(), text, Toast.LENGTH_LONG).show();
				}       		
			}			
        });
        
        
        //tv_total.setText("共"+String.valueOf(examList.size())+"个专业");
        
        RelativeLayout re_morality=(RelativeLayout) headView.findViewById(R.id.re_exam_morality);
        re_morality.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getActivity(),NewFriendsActivity.class));                 
            }            
        });
        
        /*
        RelativeLayout re_safety=(RelativeLayout) headView.findViewById(R.id.re_exam_safety);
        re_safety.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getActivity(),NewFriendsActivity.class));                 
            }            
        });
        
        RelativeLayout re_rule=(RelativeLayout) headView.findViewById(R.id.re_exam_rule);
        re_rule.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getActivity(),NewFriendsActivity.class));                 
            }            
        });
        */
        
        
	}
	
	private void getExamList() {
		
		//LoadDataFromServer task = new LoadDataFromServer( getActivity(), Constant;, map);
		
        examList.clear();
        // 获取本地好友列表
        Map<String, Exam> exam = MYApplication.getInstance().getExamMap();
        
        //exam.size();
        //Log.d( TAG, "size : "+ String.valueOf(exam.size()) );
        
        Iterator<Entry<String, Exam>> iterator = exam.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Exam> entry = iterator.next();
            
            //if (!entry.getKey().equals(Constant.NEW_FRIENDS_USERNAME) && !entry.getKey().equals(Constant.GROUP_USERNAME) )
            	examList.add(entry.getValue());
            	
            	Log.d( TAG, "value : "+ entry.getValue().getName() +" id: "+ entry.getValue().getId());
        }
  
 
        // 对list进行排序
        Collections.sort(examList, new PinyinComparator() {});
    }

	@SuppressLint("DefaultLocale")
    public class PinyinComparator implements Comparator<Exam> {

        @SuppressLint("DefaultLocale")
        @Override
        public int compare(Exam o1, Exam o2) {
            // TODO Auto-generated method stub
            String py1 = o1.getHeader();
            String py2 = o2.getHeader();
            // 判断是否为空""
            if (isEmpty(py1) && isEmpty(py2))
                return 0;
            if (isEmpty(py1))
                return -1;
            if (isEmpty(py2))
                return 1;
            String str1 = "";
            String str2 = "";
            try {
                str1 = ((o1.getHeader()).toUpperCase()).substring(0, 1);
                str2 = ((o2.getHeader()).toUpperCase()).substring(0, 1);
            } catch (Exception e) {
                System.out.println("某个str为\" \" 空");
            }
            return str1.compareTo(str2);
        }

        private boolean isEmpty(String str) {
            return "".equals(str.trim());
        }
    }

}
