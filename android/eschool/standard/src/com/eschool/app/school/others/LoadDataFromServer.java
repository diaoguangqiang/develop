package com.eschool.app.school.others;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

/*
 * 
 */
public class LoadDataFromServer {

	public static final String TAG = "LoadDataFromServer";
	
	private String url;
    private Map<String, String> map = null;
    private List<String> members = new ArrayList<String>();
    // 是否包含数组，默认是不包含
    private boolean has_Array = false;
    Context context;
        
    //protected String charset = HTTP.UTF_8;
    
	public LoadDataFromServer(Context context, String url,
            Map<String, String> map) {
		this.url = url;
        this.map = map;
        has_Array = false;
        this.context = context;
        
        Log.d(TAG, "LoadDataFromServer 构造");
	}
	
	public LoadDataFromServer(Context context, String url,
            Map<String, String> map, List<String> members) {
		this.url = url;
        this.map = map;
        this.members = members;
        has_Array = true;	
	}
	
	/*
	 * 
	 */
	@SuppressLint("HandlerLeak")
	public void getData(final DataCallBack dataCallBack) {
		
		Log.d(TAG, "getData");
		
		/*
		 * 
		 */
		final Handler handler = new Handler() {
			@Override
            public void handleMessage(Message msg) {
				
				Log.d(TAG, "handleMessage");
				
                if (msg.what == 111 && dataCallBack != null) {
                	
                	Log.d(TAG, "handleMessage 11");
                	
                    JSONObject jsonObject = (JSONObject) msg.obj;

                    dataCallBack.onDataCallBack(jsonObject);

                } else {
                	Log.d(TAG, "getData 访问服务器失败");
                    Toast.makeText(context, "服务器访问失败!", Toast.LENGTH_LONG).show();
                    
                    return;
//                    JSONObject jsonObject = null;
//                    dataCallBack.onDataCallBack(jsonObject);
                }
            }
		};
		
		/*
		 * 
		 */
		new Thread() {
			private String charset = HTTP.UTF_8;;
			protected Map<String, String> headers = null;
			
			/*
			 * (non-Javadoc)
			 * @see java.lang.Thread#run()
			 */
			public void run() {
				///////////////////////////////////////////////////////////
				
				// 初始化客户端请求
				HttpClient httpClient = new DefaultHttpClient();
				
				// 设置 POST 请求的实体部分
                HttpPost httpPost = new HttpPost(url);
                
				MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create(); 
				// 设置浏览器兼容模式
				multipartEntityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
				//multipartEntityBuilder.setCharset(Charset.forName(this.charset));
				ContentType contentType= ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8);
				
				//begin
				// 发送的数据
                Set keys = map.keySet();
                if (keys != null) {
                    Iterator iterator = keys.iterator();
                    
                    while (iterator.hasNext()) {
                        String key = (String) iterator.next();
                        String value = (String) map.get(key);
                        
                        if (key.equals("file")) {
                            File file = new File(value);
                            multipartEntityBuilder.addBinaryBody(key, file);                            
                        } else {
                        	multipartEntityBuilder.addTextBody(key, value, contentType);
                        	//multipartEntityBuilder.addPart(key, new StringBody());
                            System.out.println("key---->>>>" + key
							        + "------value---->>>>" + value);
                            Log.d(TAG, "key:" + key +", value:"+value );
                            
                        }//if (key.equals("file"))
                        
                    }//while (iterator.hasNext())

                }//if (keys != null)
                
                //////////////////////////////////////////////////////////
                // 如果包含数组，要把包含的数组放进去，项目目前只有members这个数组，所有固定键值，为了更灵活
                // 可以将传入自定义的键名......
                if (has_Array) {
                    for (int i = 0; i < members.size(); i++) {
                        //builder.addPart(key, new StringBody( value, ContentType.create("UTF-8" ) ) );
                    	//multipartEntityBuilder.add
						//builder.addPart("members[]", new StringBody( members.get(i), ContentType.create("UTF-8")));
                    	//;//暂时不处理
                    	Log.d(TAG, "数组暂时不处理" );
                    }//for (int i = 0; i < members.size(); i++)
                }//if (has_Array)
                                
                ///////////////////////////////////////////////////////////////////////
                httpClient.getParams().setParameter( CoreConnectionPNames.CONNECTION_TIMEOUT, 30000);
                // 请求超时
                httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 30000);
                
                // 生成 HTTP 实体
                //HttpEntity httpEntity = multipartEntityBuilder.build();                
                               
                // 发送 HTTP 请求
                httpPost.setEntity(multipartEntityBuilder.build());
                
               StringBuilder stringBuilder = new StringBuilder();
                try {
                	Log.d(TAG, "准备请求: " + httpPost.getURI() );
                	//Toast.makeText(context, "准备请求："+httpPost.getURI(), Toast.LENGTH_LONG).show();
                    HttpResponse httpResponse = httpClient.execute(httpPost);

                    if (httpResponse.getStatusLine().getStatusCode() == 200) {
                    	Log.d(TAG, "返回成功" );
                        BufferedReader reader = new BufferedReader(
                        		new InputStreamReader(httpResponse.getEntity().getContent(), 
                        				Charset.forName("UTF-8")));
                        
                        for (String s = reader.readLine(); s != null; s = reader.readLine()) {
                        	stringBuilder.append(s);
                        }
                        
                        String builder_BOM = jsonTokener(stringBuilder.toString());
                        System.out.println("返回数据是------->>>>>>>>" + stringBuilder.toString());
                        
                        try {
                            JSONObject jsonObject = new JSONObject();
                            jsonObject = JSONObject.parseObject(builder_BOM);
                            Message msg = new Message();
                            msg.what = 111;
                            msg.obj = jsonObject;
                            handler.sendMessage(msg);
                        } catch (JSONException e) {
                            Message msg = new Message();
                            msg.what = 222;
                            msg.obj = null;
                            handler.sendMessage(msg);
                            e.printStackTrace();
                        }
                    }//if (response.getStatusLine().getStatusCode() == 200)

                } catch (ClientProtocolException e) {
                    Message msg = new Message();
                    msg.what = 222;
                    msg.obj = null;
                    handler.sendMessage(msg);
                    e.printStackTrace();

                } catch (IOException e) {
                    Message msg = new Message();
                    msg.what = 222;
                    msg.obj = null;
                    handler.sendMessage(msg);
                    e.printStackTrace();
                }
                
                //end
			}//public void run()			
			
		}.start();
	}
	
	@SuppressWarnings("unused")
	private String jsonTokener(String in) {
        // consume an optional byte order mark (BOM) if it exists
        if (in != null && in.startsWith("\ufeff")) {
            in = in.substring(1);
        }
        return in;
    }
	
	/*
	 * 接口
	 */
	public interface DataCallBack {
        void onDataCallBack(JSONObject data);
    }
	
}
