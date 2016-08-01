package com.eschool.app.activity;

import com.eschool.app.R;

import android.os.Bundle;
import android.webkit.WebView;

public class LibraryWebSiteActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_library_web_site);
		
		initView();
	}
	
	private void initView(){
		
		WebView webView = (WebView) findViewById(R.id.wv_library_web);		 
		String url = "http://lib.zjnu.edu.cn";
		
		webView.loadUrl(url);
		
		return;
	}

}
