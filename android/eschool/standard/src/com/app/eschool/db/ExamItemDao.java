package com.app.eschool.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eschool.app.domain.ExamItem;
import com.eschool.app.domain.RuleItem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ExamItemDao {

	public static final String TAG = "ExamItemDao";	
	
	public static final String TABLE_NAME = "tb_exam_item";
	
	public static final String COLUMN_NAME_ID = "id";
	public static final String COLUMN_NAME_PID = "pid";
	
	public static final String COLUMN_NAME_NAME = "title";
	
	public static final String COLUMN_NAME_ANSWER_A = "answera";
	public static final String COLUMN_NAME_ANSWER_B = "answerb";
	public static final String COLUMN_NAME_ANSWER_C = "answerc";
	public static final String COLUMN_NAME_ANSWER_D = "answerd";
	
	public static final String COLUMN_NAME_WHY = "why";
	
	private DbOpenHelper dbHelper;
    
	public ExamItemDao(Context context) {
		Log.d(TAG, "RuleItemDao 构造");
		dbHelper = DbOpenHelper.getInstance(context);
	}
	
	public void saveList(List<ExamItem> list) {
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if (db.isOpen()) {
			db.delete(TABLE_NAME, null, null);
			
			for (ExamItem item : list) {
				ContentValues values = new ContentValues();
				
				if( null != item.getId() ) 
				{
					values.put( COLUMN_NAME_ID, item.getId() );
				}
				
				if( null != item.getPid() ) 
				{
					values.put( COLUMN_NAME_PID, item.getPid() );
				}
								
				if( item.getProblem() != null ){
					values.put(COLUMN_NAME_NAME, item.getProblem());
				}
				
				if( item.getAnswer_a() != null ){
					values.put(COLUMN_NAME_ANSWER_A, item.getAnswer_a());
				}
				
				if( item.getAnswer_a() != null ){
					values.put(COLUMN_NAME_ANSWER_B, item.getAnswer_b());
				}
				
				if( item.getAnswer_a() != null ){
					values.put(COLUMN_NAME_ANSWER_C, item.getAnswer_c());
				}
				
				if( item.getAnswer_a() != null ){
					values.put(COLUMN_NAME_ANSWER_D, item.getAnswer_d());
				}
				
				if( item.getWhy() != null ){
					values.put(COLUMN_NAME_WHY, item.getWhy());
				}
				
				//Log.d(TAG, "写入 " + item.getId() +", "+ item.getPid() + " " + item.getProblem() );
				db.replace(TABLE_NAME, null, values);
			}
			
			dbHelper.closeDB();
		}
	}
	
	public Map<String, ExamItem> getMap() {
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		Map<String, ExamItem> map = new HashMap<String, ExamItem>();
		if (db.isOpen()) {
			Cursor cursor = db.rawQuery("select * from " + TABLE_NAME  + " order by random() asc limit 100" , null);
			
			int index = 0;
			while (cursor.moveToNext()) {				
				String id = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ID));
				String pid = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_PID));
				String title = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_NAME));				
				String answer_a = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ANSWER_A));
				String answer_b = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ANSWER_B));
				String answer_c = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ANSWER_C));
				String answer_d = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ANSWER_D));
				String why = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_WHY));				
			
				ExamItem item = new ExamItem();
				item.setId(id);
				item.setPid(pid);
				item.setProblem(title);
				item.setAnswer_a(answer_a);
				item.setAnswer_b(answer_b);
				item.setAnswer_c(answer_c);
				item.setAnswer_d(answer_d);
				item.setWhy(why);
				
				Log.d(TAG, "读取 ExamItem key: " + index +", value: " + item.getProblem() );
				map.put( String.valueOf(index), item);
				index++;
			}
		
			cursor.close();
			//db.close();
		}
		
		dbHelper.closeDB();
		
		return map;		
	}
	
	public void deleteRecordById(String id){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if(db.isOpen()){
			db.delete(TABLE_NAME, COLUMN_NAME_ID + " = ?", new String[]{id});
		}
		
		dbHelper.closeDB();
	}
	
	public void deleteRecordByPid(String pid){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if(db.isOpen()){
			db.delete(TABLE_NAME, COLUMN_NAME_PID + " = ?", new String[]{pid});
		}
		
		dbHelper.closeDB();
	}
	
	
	public void saveRecord(ExamItem item){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		if (db.isOpen()) {
			if( item.getPid() != null ){
				values.put(COLUMN_NAME_PID, item.getPid());
			}
			
			if( item.getProblem() != null ){
				values.put(COLUMN_NAME_NAME, item.getProblem());
			}
			
			if( item.getAnswer_a() != null ){
				values.put(COLUMN_NAME_ANSWER_A, item.getAnswer_a());
			}
			
			if( item.getAnswer_b() != null ){
				values.put(COLUMN_NAME_ANSWER_B, item.getAnswer_b());
			}
			
			if( item.getAnswer_c() != null ){
				values.put(COLUMN_NAME_ANSWER_C, item.getAnswer_c());
			}
			
			if( item.getAnswer_d() != null ){
				values.put(COLUMN_NAME_ANSWER_D, item.getAnswer_d());
			}
			
			db.replace(TABLE_NAME, null, values);
		}
	
		dbHelper.closeDB();
	}
	
}
