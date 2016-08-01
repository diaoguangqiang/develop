package com.eschool.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.xutils.x;

import com.eschool.app.domain.Exam;
import com.eschool.app.domain.ExamItem;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public class MYApplication extends Application {

	public static final String TAG = "MYApplication";
	//public static Context applicationContext;
    
	private static MYApplication instance;
	public static Context applicationContext;
	private MYController controller = null;
    private List<Activity> aList = new ArrayList<Activity>();
        
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		//System.out.println( System.getProperty("java.classpath") );
		
		//x.Ext.init(this);
		//x.Ext.setDebug(true); // 是否输出debug日志
		
		applicationContext = this;
        instance = this;

        //MYModel model = new MYModel(applicationContext);
        
        if( controller == null )
        	controller = new MYController(applicationContext);
	}

	public void addActivity(Activity activity) {
        if (!aList.contains(activity)) {

            aList.add(activity);
        }

    }

    public void finishActivitys() {

        for (int i = 0; i < aList.size(); i++) {

            if (!aList.get(i).isFinishing())
                aList.get(i).finish();

        }
    }
    
    public static MYApplication getInstance() {
    
		return instance;
	}

	public Map<String, Exam> getExamMap(){
		return controller.getExamMap();
	}
	
	public Map<String, ExamItem> getExamItemMap(){
		return controller.getExamItemMap();
	}
	
	public void saveExamItemList(){
		//controller.
		return;
	}
	
	public List< Map<String, ExamItem>> getExamItemList(){
		return controller.getExamItemList();
	}
}
