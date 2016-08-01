package com.app.eschool.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eschool.app.domain.Exam;
import com.eschool.app.domain.RuleItem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ExamDao {

	public static final String TAG = "ExamDao";	
	
	public static final String TABLE_NAME = "tb_exam";
	
	public static final String COLUMN_NAME_ID = "id";
	public static final String COLUMN_NAME_NAME = "name";
	public static final String COLUMN_NAME_HEADER = "header";
	public static final String COLUMN_NAME_NUM = "num";
	public static final String COLUMN_NAME_UNREADNUM = "unreadmsgnum";
	 
    private DbOpenHelper dbHelper;
    
    public ExamDao(Context context) {
		Log.d(TAG, "ExamDao 构造");
		dbHelper = DbOpenHelper.getInstance(context);
		
	}

    public void saveList(List<Exam> list) {
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if (db.isOpen()) {
			db.delete(TABLE_NAME, null, null);
			
			for (Exam item : list) {
				ContentValues values = new ContentValues();
											
				if( item.getName() != null ){
					values.put( COLUMN_NAME_NAME, item.getName());
				}
				
				if( item.getHeader() != null ){
					values.put( COLUMN_NAME_HEADER, item.getHeader());
				}
				
				if( item.getNum() != null ){
					values.put( COLUMN_NAME_NUM, item.getNum() );
				}
				
				if( item.getUnreadMsgCount() != null ){
					values.put( COLUMN_NAME_UNREADNUM, item.getUnreadMsgCount() );
				}
				
				//Log.d(TAG, "写入 name: " + item.getName() +", id : "+ item.getId() );
				db.replace(TABLE_NAME, null, values);
			}
			
			dbHelper.closeDB();
		}
	}
    
	public Map<String, Exam> getMap() {
		// TODO Auto-generated method stub
		
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		Map<String, Exam> lists = new HashMap<String, Exam>();
		if (db.isOpen()) {
			Cursor cursor = db.rawQuery("select * from " + TABLE_NAME , null);
			//cursor.getCount();
			Log.d( TAG, "count: " + String.valueOf(cursor.getCount()));
			
			while (cursor.moveToNext()) {
				String id = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ID));
				String header = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_HEADER));
				String name = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_NAME));
				String num = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_NUM));
				String unreadmsgnum = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_UNREADNUM));
				
				Exam item = new Exam();
				item.setId(id);
				item.setHeader(header);
				item.setName(name);
				item.setNum(num);
				item.setUnreadMsgCount(unreadmsgnum);
				
				lists.put(name, item);	
				
				Log.d(TAG, "读取 name: " + item.getName() +", id : "+ item.getId() );
				
			}
		
			cursor.close();
			//db.close();
		}
		
		dbHelper.closeDB();
		//lists.size();
		
		Log.d(TAG, "size : "+ String.valueOf(lists.size()));
		
		return lists;
		
	}
}
