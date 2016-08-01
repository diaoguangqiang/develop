package com.app.eschool.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eschool.app.domain.RuleItem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/*
 * ruleclass: id, name (标识，名字)
 * ruleitem: id, pid, name (标识，父标识，名字)
 * ruleiteminfo: id, pid, content (标识， 父标识，名字)
*/
public class RuleItemDao {

	public static final String TAG = "RuleItemDao";
	
	public static final String TABLE_NAME = "rule_item";
	public static final String COLUMN_NAME_ID = "id";
	public static final String COLUMN_NAME_PID = "pid";
    public static final String COLUMN_NAME_NAME = "name";
    
    private DbOpenHelper dbHelper;
    
	public RuleItemDao(Context context) {
		Log.d(TAG, "RuleItemDao 构造");
		dbHelper = DbOpenHelper.getInstance(context);
	}
	
	public void saveList(List<RuleItem> list) {
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if (db.isOpen()) {
			db.delete(TABLE_NAME, null, null);
			
			for (RuleItem item : list) {
				ContentValues values = new ContentValues();
				
				if( null != item.getPid() ) 
				{
					values.put( COLUMN_NAME_PID, item.getPid() );
				}
								
				if( item.getName() != null ){
					values.put(COLUMN_NAME_NAME, item.getName());
				}
				
				Log.d(TAG, "写入 " + item.getPid() + " " + item.getName() );
				db.replace(TABLE_NAME, null, values);
			}
			
			dbHelper.closeDB();
		}
	}
	
	public Map<String, RuleItem> getList() {
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		Map<String, RuleItem> lists = new HashMap<String, RuleItem>();
		if (db.isOpen()) {
			Cursor cursor = db.rawQuery("select * from " + TABLE_NAME /* + " desc" */, null);
			while (cursor.moveToNext()) {
				String id = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_ID));
				String pid = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_PID));
				String name = cursor.getString(cursor.getColumnIndex(COLUMN_NAME_NAME));
			
				RuleItem item = new RuleItem();
				item.setId(id);
				item.setPid(pid);
				item.setName(name);
				
				lists.put(name, item);				
			}
		
			cursor.close();
			//db.close();
		}
		
		dbHelper.closeDB();
		
		return lists;		
	}
	
	public void deleteRecord(String username){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if(db.isOpen()){
			db.delete(TABLE_NAME, COLUMN_NAME_NAME + " = ?", new String[]{username});
		}
	}
	
	public void deleteRecordById(String id){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if(db.isOpen()){
			db.delete(TABLE_NAME, COLUMN_NAME_ID + " = ?", new String[]{id});
		}
	}
	
	public void deleteRecordByPid(String pid){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		if(db.isOpen()){
			db.delete(TABLE_NAME, COLUMN_NAME_PID + " = ?", new String[]{pid});
		}
	}
	
	public void saveRecord(RuleItem item){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		
		if( item.getName() != null ){
			values.put(COLUMN_NAME_NAME, item.getName());
		}
		
		if( item.getPid() != null ){
			values.put(COLUMN_NAME_PID, item.getPid());
		}
		
		if(db.isOpen()){
			db.replace(TABLE_NAME, null, values);
		}			
	}
	
}
