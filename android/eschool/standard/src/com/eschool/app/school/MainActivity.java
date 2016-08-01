package com.eschool.app.school;

import com.eschool.app.R;
import com.eschool.app.activity.BaseActivity;
import com.eschool.app.widget.AddPopWindow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

	protected static final String TAG = "MainActivity";

	//容纳4个菜单；数组
	private Fragment[] fragments;
	
	//通知
	public FragmentCoversation homefragment;
    //题库
	private FragmentExam contactlistfragment;
    //发现
	private FragmentFind findfragment;
    //我
	private FragmentProfile profilefragment;
    
	//容纳4个图片；数组
	private ImageView[] imagebuttons;
	
	//容纳4个文字;数组
	private TextView[] textviews;
	
    private int index;
    // 当前fragment的index
    private int currentTabIndex;
	
    private ImageView iv_add;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main_temp);

		initView();

		
		iv_add = (ImageView) this.findViewById(R.id.iv_add);
		/*
		iv_add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AddPopWindow addPopWindow = new AddPopWindow(MainActivity.this);
                addPopWindow.showPopupWindow(iv_add);
            }
			
        });
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void initView() {
		//主页
		homefragment = new FragmentCoversation();
        //题库
		contactlistfragment = new FragmentExam();
		//发现
        findfragment = new FragmentFind();
        //我
        profilefragment = new FragmentProfile();
        //4个菜单
        fragments = new Fragment[] { homefragment, contactlistfragment,
        		findfragment, profilefragment };
        //图片部分
        imagebuttons = new ImageView[4];
        imagebuttons[0] = (ImageView) findViewById(R.id.ib_weixin);
        imagebuttons[1] = (ImageView) findViewById(R.id.ib_contact_list);
        imagebuttons[2] = (ImageView) findViewById(R.id.ib_find);
        imagebuttons[3] = (ImageView) findViewById(R.id.ib_profile);     
        //设置第一幅图片，默认选中
        imagebuttons[0].setSelected(true);
        //文字部分：通知；题库；发现；我
        textviews = new TextView[4];
        textviews[0] = (TextView) findViewById(R.id.tv_weixin);
        textviews[1] = (TextView) findViewById(R.id.tv_contact_list);
        textviews[2] = (TextView) findViewById(R.id.tv_find);
        textviews[3] = (TextView) findViewById(R.id.tv_profile);
        //设置第一个文字颜色；通知
        textviews[0].setTextColor(0xFF45C01A);
        
        // 添加显示第一个fragment
        getSupportFragmentManager().beginTransaction()
		        .add(R.id.fragment_container, homefragment)
		        .add(R.id.fragment_container, contactlistfragment)
		        .add(R.id.fragment_container, profilefragment)
		        .add(R.id.fragment_container, findfragment)
		        .hide(contactlistfragment).hide(profilefragment)
		        .hide(findfragment).show(homefragment).commit();
        
	}
	
	public void onTabClicked(View view) {
        switch (view.getId()) {
        case R.id.re_weixin:
            index = 0;
            break;
        case R.id.re_contact_list:
            index = 1;
            break;
        case R.id.re_find:
            index = 2;
            break;
        case R.id.re_profile:
            index = 3;
            break;

        }

        if (currentTabIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager()
                    .beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.fragment_container, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }
        imagebuttons[currentTabIndex].setSelected(false);
        // 把当前tab设为选中状态
        imagebuttons[index].setSelected(true);
        textviews[currentTabIndex].setTextColor(0xFF999999);
        textviews[index].setTextColor(0xFF45C01A);
        currentTabIndex = index;
    }

}
