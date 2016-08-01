package com.eschool.app;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.util.Log;

import com.eschool.app.domain.Exam;
import com.eschool.app.domain.ExamItem;

public class MYController {

	public static final String TAG = "MYController";
	
	protected Context context = null;
	
	private Map<String, Exam> examList = null;
	private Map<String, ExamItem> examItemMap = null;
	
	private MYModel model;
	
	public MYController(Context text) {
		super();
		
		context = text;
	}
	
	public MYModel getModel() {
		model = new MYModel(context);
		return model;
	}

	public Map<String, Exam> getExamMap() {
		// TODO Auto-generated method stub
		if( null == examList ){
			examList = getModel().getExamMap();
		}
		//examList.size();
		Log.d(TAG,"size: "+ String.valueOf(examList.size()));
		return examList;
	}
	
	/*
	 * 暂时不实现
	 */
	public List< Map<String, ExamItem> > getExamItemList() {
				
		return null;
	}
	
	public Map<String, ExamItem> getExamItemMap() {
		// TODO Auto-generated method stub
		if( null == examItemMap ){
			examItemMap = getModel().getExamItemMap();
		}
		
		Log.d(TAG,"size: "+ String.valueOf(examItemMap.size()));
		return examItemMap;
	}
	
	

}
