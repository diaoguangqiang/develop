package com.eschool.app.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.eschool.app.Constant;
import com.eschool.app.R;
import com.eschool.app.school.others.LoadDataFromServer;
import com.eschool.app.school.others.LoadDataFromServer.DataCallBack;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

/*
 * 发现页面 --> 规章制度
 */
public class RulesRegulatoryActivity extends BaseActivity implements OnItemClickListener {

	public static final String TAG = "RulesRegulatoryActivity";
	
	
	String userID;
	private ListView listView;
	private ArrayAdapter<String> arr_adapter;
	private SimpleAdapter simp_adapter;
	private ArrayList<Map<String, Object>> dataList;
	private static final String[] strs = new String[] {
		    "一、浙江师范大学关于印发研究生学籍管理实施细则（修订）的通知红头文件", 
		    "二、浙江师范大学关于印发研究生教学工作规程的通知红头文件", 
		    "三、浙江师范大学关于印发研究生学术交流管理办法的通知红头文件",
		    "四、浙江师范大学研究生学术道德规范管理条例",
		    "五、浙江师范大学关于印发研究生助教岗位设置与管理实施意见的通知红头文件",
		    "六、浙江师范大学关于印发专业学位管理暂行规程的通知",
		    "七、浙江师范大学关于印发学位授予实施办法的通知",
		    "八、浙江师范大学关于印发硕士学位授予工作细则的通知",
		    "九、浙江师范大学关于印发授予具有研究生毕业同等学力人员硕士学位实施细则（修订）的通知红头文件",
		    "十、浙江师范大学关于印发研究生学位论文检测暂行办法的通知红头文件",
		    "十一、浙江师范大学关于印发研究生学位论文格式规范（修订）的通知",
		    "十二、浙江师范大学关于印发研究生涉密学位论文管理规定的通知",
		    "十三、浙江师范大学关于印发硕士研究生提前毕业进行学位论文答辩的有关规定（修订）的通知",
		    "十四、浙江师范大学关于印发优秀硕士学位论文培育和评选办法的通知",
		    "十五、浙江师范大学关于印发研究生优秀学位论文奖励办法的通知",
		    "十六、浙江师范大学关于印发研究生科研成果奖励办法（试行）的通知",
		    "十七、浙江师范大学关于印发研究生奖助体系实施办法的通知红头文件",
		    "十八、浙江师范大学关于印发研究生国家奖学金管理办法(试行)的通知",
		    "十九、浙江师范大学关于印发硕士研究生综合测评办法（试行）的通知",
		    "二十、浙江师范大学关于印发研究生荣誉称号评选办法（试行）的通知",
		    "二十一、浙江师范大学关于印发研究生国家奖学金管理办法(试行)的通知",
		    "二十二、浙江师范大学关于印发研究生学费管理办法（试行）的通知红头文件",
		    "二十三、浙江师范大学考试管理条例（摘录）",
		    "二十四、浙江师范大学学生违纪处分规定",
		    "二十五、浙江师范大学学生校内申诉管理规定",
		    "二十六、浙江师范大学关于印发浙江师范大学研究生住宿管理规定的通知",
		    "二十七、浙江师范大学关于印发研究生安全教育及管理规定的通知",
		    "二十八、浙江师范大学关于印发研究生婚育管理办法的通知",
		    "二十九、浙江师范大学研究生请假制度",
		    "三十、浙江师范大学关于印发研究生临时困难补助实施办法的通知红头文件",
		    "三十一、浙江师范大学实验室安全管理实施办法（摘录）",
		    "三十二、浙江师范大学实验室安全事故认定与处理办法"
		    
		    };//定义一个String数组用来显示ListView的内容private ListView lv;/** Called when the activity is first created. */

	ProgressDialog dialog;
	
	@Override
	protected void onCreate(Bundle arg0) {		
		super.onCreate(arg0);
		
		setContentView(R.layout.activity_social_main);
		
		userID = this.getIntent().getStringExtra("userID");
		
		//initFile();
		initView();
		
		
	}
	
	/*
	 * 初始化列表
	 */
	private void initView() {
		listView = (ListView) findViewById(R.id.list_view_rule);
		//创建适配器，加载数据源
		//arr_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs);
		
		dataList = new ArrayList<Map<String, Object>>();
		simp_adapter = new SimpleAdapter( this, getData(), R.layout.activity_rules_item, new String[]{"id", "title"}, new int[]{R.id.rule_id, R.id.rule_title} );
		
		//
		//listView.setAdapter(arr_adapter);
		listView.setAdapter(simp_adapter);
		
		// 设置ListView的元素被选中时的事件处理监听器
		listView.setOnItemClickListener(this);
	}
	
	
	private List<Map<String, Object>> getDataX(){
		final String password = "123456";
        String usertel = "diao";
        Map<String, String> map = new HashMap<String, String>();

        map.put("user", usertel);
        map.put("pass", password);
        LoadDataFromServer task = new LoadDataFromServer(
        		RulesRegulatoryActivity.this, Constant.URL_Login, map);
        
        //
        task.getData(new DataCallBack() {
            @Override
            public void onDataCallBack(JSONObject data) {
                if (data == null) {
                    Toast.makeText(RulesRegulatoryActivity.this,
                            "返回数据错误../", Toast.LENGTH_SHORT)
                            .show();
                        return ;
                }
                
                try {
                    int code = data.getInteger("code");
                    if (code == 1) {
                        JSONObject json = data.getJSONObject("user");
                        login(json);
                    } else if (code == 2) {
                        dialog.dismiss();
                        Toast.makeText(RulesRegulatoryActivity.this,
                                "账号或密码错误...", Toast.LENGTH_SHORT)
                                .show();
                    } else if (code == 3) {
                        dialog.dismiss();
                        Toast.makeText(RulesRegulatoryActivity.this,
                                "服务器端注册失败...", Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        dialog.dismiss();
                        Toast.makeText(RulesRegulatoryActivity.this,
                                "服务器繁忙请重试...", Toast.LENGTH_SHORT)
                                .show();
                    }

                } catch (JSONException e) {
                    dialog.dismiss();
                    Toast.makeText(RulesRegulatoryActivity.this, "数据解析错误...",
                            Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
               
        
		return dataList;		
	}
	
	
	private List<Map<String, Object>> getData()
	{
		for( int i = 0; i <= 31; i++ )
		{
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", i+1);
			map.put("title", strs[i]);
			dataList.add(map);
		}
		return dataList;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		// 获取点击ListView item中的内容信息
		String text = listView.getItemAtPosition(position) + "";
		// 弹出Toast信息显示点击位置和内容
		//Toast.makeText(this,"position=" + position + " content=" + text, 0).show();
		Toast.makeText(this, text, 0).show();
		
		startActivity(new Intent(RulesRegulatoryActivity.this, RulesRegulatoryItem.class).putExtra("rid", String.valueOf(position)));
	}
	
	private void login(final JSONObject json) {
		try{
			final String nick = json.getString("nick");
            final String password = json.getString("password");
            
            Log.d(TAG, "反馈 name: " + nick + ", pwd: " + password );			
			
		} catch (JSONException e1) {

            e1.printStackTrace();
        }
	}

		
	
}









