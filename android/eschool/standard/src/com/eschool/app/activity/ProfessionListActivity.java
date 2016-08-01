package com.eschool.app.activity;

import com.eschool.app.R;
import com.eschool.app.widget.ProfessionGridView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessionListActivity extends BaseActivity implements OnClickListener {
	private ImageView iv_more;
	private ProfessionGridView gridView;
	/*
	private final static String[] names = new String[] { "C", "JAVA", "C++",
	            "C#", "PHP", "JavaScript", "Python", "Perl", "Visual Basic", "Delphi", "Objective-C",
	            "Mysql", "Oracle", "Android", "Linux", "算法", "更多" };
	private final static int[] images = new int[] { R.drawable.w1,
	            R.drawable.w1, R.drawable.w1, R.drawable.w1, R.drawable.w1,
	            R.drawable.w1, R.drawable.w1, R.drawable.w1, R.drawable.w1,
	            R.drawable.w1, R.drawable.w1, R.drawable.w1, R.drawable.w1,
	            R.drawable.w1, R.drawable.w1, R.drawable.w1, R.drawable.w8 };
	*/
	
	/*
	private final static String[] names = new String[] { 
		"C", "JAVA", "C++",
        "C#", "PHP", "Mysql", 
        "Android", "Linux","Objective-C",
        "算法", "更多" };
	private final static int[] images = new int[] { 
		R.drawable.w1, R.drawable.w1, R.drawable.w1, 
		R.drawable.w1, R.drawable.w1, R.drawable.w1,
		R.drawable.w1, R.drawable.w1, R.drawable.w1,
        R.drawable.w1, R.drawable.w8 };
	*/
	
	private final static String[] names = new String[] { 
		"Linux", "更多" };
	private final static int[] images = new int[] { 
		R.drawable.w1, R.drawable.w8 };
	
	private Myadapter adapter;
	private ScrollView srollView;
	
	private String id;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.activity_profession_list);	      
	       
	       id = this.getIntent().getStringExtra("id");	       
	       
	       //final String head = this.getIntent().getStringExtra("header");
	       final String name = this.getIntent().getStringExtra("name");
	       
	       TextView tv_head = (TextView) this.findViewById(R.id.tv_title);	       
	       tv_head.setText(name);
	       	        
	       initView();

	    }
	 
	private void initView() {
		iv_more = (ImageView) this.findViewById(R.id.iv_more);
	    iv_more.setOnClickListener(this); 
	    
	    gridView = (ProfessionGridView) findViewById(R.id.gridView);
        adapter = new Myadapter(ProfessionListActivity.this, images, names);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
            	
            	// 弹出Toast信息显示点击位置和内容
        		String text = "pos :" + String.valueOf(position) +", id :"+String.valueOf(id);				
        		//Toast.makeText( ProfessionListActivity.this, text, Toast.LENGTH_LONG).show();
        		
                if (position == 0) { 
                    startActivity(new Intent(ProfessionListActivity.this, ProfessionExamInfoActivity.class));
                }
            }

        });
        
        srollView = (ScrollView) findViewById(R.id.srollView);

        
        this.findViewById(R.id.re_money).setOnClickListener(this);
        RelativeLayout re_card = (RelativeLayout) this.findViewById(R.id.re_card);
        re_card.setOnClickListener(this);
        //TextView tv_desc = (TextView) this.findViewById(R.id.tv_desc);

        //tv_desc.setText("BBBBB"); 
	}
	
	@Override
	public void onClick(View v) {
		 switch (v.getId()) {
	        case R.id.iv_more:
	            showPopView();

	            break;	        
	            
	        	
	        case R.id.re_money:
	            //startActivity(new Intent(WalletActivity.this, MoneyActivity.class));

	            break;
	            
	        case R.id.re_card:
	            //startActivity(new Intent(WalletActivity.this, BankCardActivity.class));

	            break;
	           
	        default:
	            break;

	        }
	 }
	 
	private void showPopView() {
	        //MorePopWindow addPopWindow = new MorePopWindow(WalletActivity.this);
	       // addPopWindow.showPopupWindow(iv_more);

	 }
	
	class Myadapter extends BaseAdapter {

        private LayoutInflater inflater;
        private int[] imageDatas;
        private String[] nameDatas;

        public Myadapter(Context context, int[] imageDatas, String[] nameDatas) {
            inflater = LayoutInflater.from(context);

            this.imageDatas = imageDatas;
            this.nameDatas = nameDatas;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return imageDatas.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return imageDatas[position];
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.itme_wallet, null, false);
            ImageView iv_image = (ImageView) convertView
                    .findViewById(R.id.iv_image);
            TextView tv_name = (TextView) convertView
                    .findViewById(R.id.tv_name);
            String name = nameDatas[position];
            int imageRes = imageDatas[position];
            iv_image.setImageResource(imageRes);
            tv_name.setText(name);
            return convertView;
        }
    }
	
	@Override
	protected void onResume() {
	        // TODO Auto-generated method stub
	        srollView.smoothScrollTo(0, 0);
	        super.onResume();
	        //TextView tv_desc = (TextView) this.findViewById(R.id.tv_desc);

	        //tv_desc.setText("A");
	        //tv_money.setText("￥"+LocalUserInfo.getInstance(getApplicationContext())
	        //        .getUserInfo("money"));
	}

}
