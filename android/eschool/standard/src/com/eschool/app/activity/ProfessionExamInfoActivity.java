package com.eschool.app.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.eschool.app.Constant;
import com.eschool.app.MYApplication;
import com.eschool.app.R;
import com.eschool.app.domain.ExamItem;
import com.eschool.app.handler.ExamHandler;
import com.eschool.app.school.others.LoadDataFromServer;
import com.eschool.app.school.others.LoadDataFromServer.DataCallBack;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessionExamInfoActivity extends BaseActivity {

	public static final String TAG = "ProfessionExamInfoActivity";

	private List< Map< String, ExamItem > >examItemList = null;
	private Map< String, ExamItem > examItemMap = new HashMap< String, ExamItem >();
	
	private TextView tv_problem;
	private RadioButton tv_answer_a;
	private RadioButton tv_answer_b;
	private RadioButton tv_answer_c;
	private RadioButton tv_answer_d;
	
	private int cur_index = 0;
	
	private ExamHandler handler = new ExamHandler(){
		public void handleMessage(android.os.Message msg){
			ExamItem item = (ExamItem) msg.obj;
			//tv_problem.setText(""+ item.getId() +" "+item.getProblem());
			tv_problem.setText(" "+item.getProblem());
			tv_answer_a.setText(""+item.getAnswer_a());
			tv_answer_b.setText(""+item.getAnswer_b());
			tv_answer_c.setText(""+item.getAnswer_c());
			tv_answer_d.setText(""+item.getAnswer_d());
			
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_profession_info);				
		
		initData();
		
	    initView();
	    
	    //startThread();	    
	}
	
	/*
	 * 获取数据
	 * 从网络后台获取数据
	 * 获取数据后，保存至本地数据库中
	 */
	private void initData(){
		
		Log.d(TAG, "initData");
		
		Map<String, String> map = new HashMap<String, String>();
        map.put("username", "diaoguangqiang");
        map.put("password", "123456");
        
		LoadDataFromServer task = new LoadDataFromServer(ProfessionExamInfoActivity.this, Constant.URL_Login, map );
			
		task.getData(new DataCallBack() {

			@Override
			public void onDataCallBack(JSONObject data) {
				// TODO Auto-generated method stub
				if( null == data ){
					Log.d(TAG, "返回数据错误");
					String text = "返回数据错误";				
	        		Toast.makeText( ProfessionExamInfoActivity.this, text, Toast.LENGTH_LONG).show();
				}
				
				try {
                    int code = data.getInteger("code");
                    if (code == 1) {
                    	Log.d(TAG, "返回码 " + code );
                        JSONObject json = data.getJSONObject("user");
                        //login(json);
                    } else if (code == 2) {
                    	Log.d(TAG, "返回码 " + code );
                        //dialog.dismiss();
                        Toast.makeText(ProfessionExamInfoActivity.this,
                                "账号或密码错误...", Toast.LENGTH_SHORT)
                                .show();
                    } else if (code == 3) {
                    	Log.d(TAG, "返回码 " + code );
                        //dialog.dismiss();
                        Toast.makeText(ProfessionExamInfoActivity.this,
                                "服务器端注册失败...", Toast.LENGTH_SHORT)
                                .show();
                    } else {
                    	Log.d(TAG, "返回码 " + code );
                        //dialog.dismiss();
                        Toast.makeText(ProfessionExamInfoActivity.this,
                                "服务器繁忙请重试...", Toast.LENGTH_SHORT)
                                .show();
                    }

                } catch (JSONException e) {
                	Log.d(TAG, "数据解析错误" );
                    //dialog.dismiss();
                    Toast.makeText(ProfessionExamInfoActivity.this, "数据解析错误...",
                            Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
				
			}});
			
	}

	private void initView(){
				
		getExamItemMap();
		
		tv_problem = (TextView) this.findViewById(R.id.tv_problem);
		tv_answer_a = (RadioButton) this.findViewById(R.id.rb_A);
		tv_answer_b = (RadioButton) this.findViewById(R.id.rb_B);
		tv_answer_c = (RadioButton) this.findViewById(R.id.rb_C);
		tv_answer_d = (RadioButton) this.findViewById(R.id.rb_D);
		
		final TextView tv_pre = (TextView) this.findViewById(R.id.tv_pre);
		final TextView tv_next = (TextView) this.findViewById(R.id.tv_next);
				
		//ExamItem item = getListExamItem(cur_index);
		ExamItem item = getMapExamItem( cur_index );
		
		tv_problem.setText( item.getProblem() );
		tv_answer_a.setText( item.getAnswer_a() );
		tv_answer_b.setText( item.getAnswer_b() );
		tv_answer_c.setText( item.getAnswer_c() );
		tv_answer_d.setText( item.getAnswer_d() );
		
		
		tv_pre.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				// 弹出Toast信息显示点击位置和内容				
        		//String text = "content :" + tv_pre.getText();				
        		//Toast.makeText( ProfessionExamInfoActivity.this, text, Toast.LENGTH_LONG).show();
        		
        		Message msg = handler.obtainMessage();
        		
        		cur_index = getMapPreExamItem(cur_index);
        		ExamItem item = getMapExamItem(cur_index);
        		
        		msg.obj = item;
        		
        		handler.sendMessage(msg);
			}			
			
		});
		
		//下一题
		tv_next.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
								       		
        		/*
        		 Message msg = new Message();
        		msg.arg1 = 10;
        		msg.arg2 = 20;
        		*/
        		
        		Message msg = handler.obtainMessage();
        		        		
        		cur_index = getMapNextExamItem(cur_index);
        		ExamItem item = getMapExamItem(cur_index);
        		
        		msg.obj = item;
        		
        		// 弹出Toast信息显示点击位置和内容
				//String text = "content :" + tv_next.getText() +""+item.getProblem();				
        		//Toast.makeText( ProfessionExamInfoActivity.this, text, Toast.LENGTH_LONG).show();
        		
        		handler.sendMessage(msg);
			}
			
		});
		
		return;
	}
	
	
	@SuppressWarnings("unused")
	private void getExamItemList(){
		examItemList = new ArrayList< Map< String, ExamItem> >();
		examItemList.add(MYApplication.getInstance().getExamItemMap());		
		return ;
	}
	
	private void getExamItemMap(){
		examItemMap.clear();
			
		examItemMap = MYApplication.getInstance().getExamItemMap();
	}
		
	/*
	 * 不适合调用
	 */
	@SuppressWarnings("unused")
	private void refresh(){
		onCreate(null);
		return;
	}
	
	/*
	 * 
	 */
	@SuppressWarnings("unused")
	private void startThread(){
	    new Thread(){
	    	public void run(){
	    		try{
	    			Thread.sleep(1000);
	    			handler.post(new Runnable(){

						@Override
						public void run() {
							// TODO Auto-generated method stub
							tv_problem.setText("test");
						}
	    				
	    			});
	    		}catch(InterruptedException e){
	    			e.printStackTrace();
	    		}
	    	}
	    }.start();
	}
	
	/*
	 * 获取上一题 id
	 */
	private int getMapPreExamItem(int _curid){		
		
		if( _curid <= 0 ){
			_curid = 0;
			
			// 弹出Toast信息显示点击位置和内容
			String text = "已经是第一题";				
    		Toast.makeText( ProfessionExamInfoActivity.this, text, Toast.LENGTH_SHORT).show();
    		
			return _curid;
		}
		
		if( _curid > examItemMap.size() )
		{
			_curid  = examItemMap.size();
			return _curid;
		}
		
		_curid -= 1;	
		
		return _curid;
	}
	
	/*
	 * 获取下一题 id
	 */
	private int getMapNextExamItem(int _curid){		
		
		if( _curid >= examItemMap.size() - 1 )
		{
			_curid  = examItemMap.size() - 1;
			
			// 弹出Toast信息显示点击位置和内容
			String text = "已经是最后第一题";				
			Toast.makeText( ProfessionExamInfoActivity.this, text, Toast.LENGTH_SHORT).show();
			    		
			return _curid;
		}
		
		if( _curid < 0 ){
			_curid = 0;
			return _curid;
		}		
		
		_curid += 1;	
		
		return _curid;
	}
	
	/*
	 * 获取内容
	 */
	private ExamItem getMapExamItem( int _curid ){
		if( _curid < 0 ) 
		{
			_curid = 0;
		}
		
		if( _curid >= examItemMap.size() - 1 )
		{
			_curid = examItemMap.size() - 1;
		}
		
		ExamItem item = null;
		
		Iterator<Entry<String, ExamItem>> iterator = examItemMap.entrySet().iterator();
        while(iterator.hasNext()) {
        	Entry<String, ExamItem> entry = iterator.next();

            String key = entry.getKey();

            if( key == String.valueOf(_curid)){                	
            	item = entry.getValue();
                
            	return item;
            }
        }			
		
		return null;
	}
	
	private ExamItem getListExamItem(int _curid){
		if( _curid < 0 )
		{
			Log.d(TAG, ""+_curid +"<0");
			return null;
		}
				
		ExamItem item = new ExamItem();//examItemList.get(_curid);
		
		for (Map<String, ExamItem> map : examItemList) {
			
			if( _curid > map.size() ){
				Log.d(TAG, ""+_curid +">"+ map.size());
				return null;
			}
			
			for (String k : map.keySet()) {
		        //System.out.println(k + " : " + map.get(k));
		        
				Log.d(TAG, " curid: "+_curid + ", k: "+k);
		        if( k == String.valueOf(_curid)){
		        	item = map.get(k);
		        	Log.d(TAG, "find curid: "+_curid +" title: "+item.getProblem());
		        }
		        else{
		        	Log.d(TAG, "not find curid: "+_curid );
		        }
		    } 
		}
		
		return item;
	}
	
}
