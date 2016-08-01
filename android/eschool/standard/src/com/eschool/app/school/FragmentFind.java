package com.eschool.app.school;

import com.eschool.app.R;
import com.eschool.app.activity.LibraryWebSiteActivity;
import com.eschool.app.activity.RulesRegulatoryActivity;
import com.eschool.app.activity.SchoolWebSiteActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentFind extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_find, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);	 
		
		//跳转至校历
		getView().findViewById(R.id.re_find_calendar).setOnClickListener(new OnClickListener(){
		            @Override
		            public void onClick(View v) {	            	   
		            	//String userID=MYApplication.getInstance().getUserName(); 
		                  //    if(!TextUtils.isEmpty(userID)){
		                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
		                  //    }
		            	
		            	// 获取点击RelativeLayout中的内容信息
		        		String text = "校历暂未开放";
						// 弹出Toast信息显示点击位置和内容
		        		Toast.makeText( getActivity(), text, Toast.LENGTH_LONG).show();
		        		
		            }
		        });
		
		//跳转至课程表
		getView().findViewById(R.id.re_find_course).setOnClickListener(new OnClickListener(){
				            @Override
				            public void onClick(View v) {	            	   
				            	//String userID=MYApplication.getInstance().getUserName(); 
				                  //    if(!TextUtils.isEmpty(userID)){
				                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
				                  //    }
				            	
				            	// 获取点击RelativeLayout中的内容信息
				        		String text = "课程表暂未开放";
								// 弹出Toast信息显示点击位置和内容
				        		Toast.makeText( getActivity(), text, Toast.LENGTH_LONG).show();
				        		
				            }
				        });
		
		//跳转至考试
		getView().findViewById(R.id.re_find_exam).setOnClickListener(new OnClickListener(){
						            @Override
						            public void onClick(View v) {	            	   
						            	//String userID=MYApplication.getInstance().getUserName(); 
						                  //    if(!TextUtils.isEmpty(userID)){
						                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
						                  //    }
						            	
						            	// 获取点击RelativeLayout中的内容信息
						        		String text = "考试内容暂未开放";
										// 弹出Toast信息显示点击位置和内容
						        		Toast.makeText( getActivity(), text, Toast.LENGTH_LONG).show();
						        		
						            }
						        });
				
			//跳转至本科生手册
			getView().findViewById(R.id.re_find_undergraduate_help).setOnClickListener(new OnClickListener(){
								            @Override
								            public void onClick(View v) {	            	   
								            	//String userID=MYApplication.getInstance().getUserName(); 
								                  //    if(!TextUtils.isEmpty(userID)){
								                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
								                  //    }
								            	
								            	// 获取点击RelativeLayout中的内容信息
								        		String text = "本科生手册暂未开放";
												// 弹出Toast信息显示点击位置和内容
								        		Toast.makeText( getActivity(), text, Toast.LENGTH_LONG).show();
								        		
								            }
								        });
				
		//跳转至研究生手册
		getView().findViewById(R.id.re_find_postgraduate_help).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
            	String userID = null;
            	startActivity(new Intent(getActivity(), RulesRegulatoryActivity.class).putExtra("userID", userID));
                  
            	//String userID=MYApplication.getInstance().getUserName(); 
                  //    if(!TextUtils.isEmpty(userID)){
                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
                  //    }
            }            
        });
		
		//跳转至学校官网
		getView().findViewById(R.id.re_find_school_web).setOnClickListener(new OnClickListener(){
		            @Override
		            public void onClick(View v) {
		            	String userID = null;
		            	startActivity(new Intent(getActivity(), SchoolWebSiteActivity.class).putExtra("userID", userID));
		                  
		            	//String userID=MYApplication.getInstance().getUserName(); 
		                  //    if(!TextUtils.isEmpty(userID)){
		                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
		                  //    }
		            }            
		        });
		
		//跳转至图书馆官网
		getView().findViewById(R.id.re_find_library_web).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
            	String userID = null;
            	startActivity(new Intent(getActivity(), LibraryWebSiteActivity.class).putExtra("userID", userID));
                  
            	//String userID=MYApplication.getInstance().getUserName(); 
                  //    if(!TextUtils.isEmpty(userID)){
                          //startActivity(new Intent(getActivity(),SocialMainActivity.class).putExtra("userID", userID));
                  //    }
            }            
        });
		
	}
}
