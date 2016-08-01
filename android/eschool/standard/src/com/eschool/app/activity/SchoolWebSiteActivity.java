package com.eschool.app.activity;

import com.eschool.app.R;

import android.os.Bundle;
import android.webkit.WebView;

public class SchoolWebSiteActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_school_web_site);
		
		initView();
	}

	private void initView(){
		
		WebView webView = (WebView) findViewById(R.id.wv_school_web);		 
		String url = "http://www.zjnu.edu.cn";
		
		webView.loadUrl(url);
		
		return;
	}
}
