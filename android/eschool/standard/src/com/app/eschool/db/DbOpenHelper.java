package com.app.eschool.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;

/*
 * ruleclass: id, name (标识，名字)
 * ruleitem: id, pid, name (标识，父标识，名字)
 * ruleiteminfo: id, pid, content (标识， 父标识，名字)
*/
public class DbOpenHelper extends SQLiteOpenHelper {

	public static final String TAG = "DbOpenHelper";
	
	private static final int DATABASE_VERSION = 1;
	private static DbOpenHelper instance;
	
	//ruleclass: id, name (标识，名字)
	private static final String RULECLASS_TABLE_CREATE = "CREATE TABLE "
            + RuleClassDao.TABLE_NAME + " ("
            + RuleClassDao.COLUMN_NAME_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
            + RuleClassDao.COLUMN_NAME_NAME +" TEXT); ";
	
	//ruleitem: id, pid, name (标识，父标识，名字)
	private static final String RULEITEM_TABLE_CREATE = "CREATE TABLE "
            + RuleItemDao.TABLE_NAME + " ("
            + RuleItemDao.COLUMN_NAME_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
            + RuleItemDao.COLUMN_NAME_NAME +" TEXT, "
            + RuleItemDao.COLUMN_NAME_PID + " TEXT);";
	
	//ruleiteminfo: id, pid, content (标识， 父标识，名字)
	private static final String RULEITEMINFO_TABLE_CREATE = "CREATE TABLE "
            + RuleItemInfoDao.TABLE_NAME + " ("
            + RuleItemInfoDao.COLUMN_NAME_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
            + RuleItemInfoDao.COLUMN_NAME_CONTENT +" TEXT, "
            + RuleItemInfoDao.COLUMN_NAME_PID + " TEXT);";
	
	//Exam: id, name, content (标识， 父标识，名字)
	private static final String EXAM_TABLE_CREATE = "CREATE TABLE "
	            + ExamDao.TABLE_NAME + " ("
	            + ExamDao.COLUMN_NAME_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	            + ExamDao.COLUMN_NAME_NAME + " TEXT, "
	            + ExamDao.COLUMN_NAME_HEADER + " TEXT, "
	            + ExamDao.COLUMN_NAME_NUM + " TEXT, "
	            + ExamDao.COLUMN_NAME_UNREADNUM + " TEXT );";
	
	private static final String EXAMITEM_TABLE_CREATE = "CREATE TABLE "
            + ExamItemDao.TABLE_NAME + " ("
            + ExamItemDao.COLUMN_NAME_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ExamItemDao.COLUMN_NAME_PID + " TEXT, "
            + ExamItemDao.COLUMN_NAME_NAME + " TEXT, "
            + ExamItemDao.COLUMN_NAME_ANSWER_A + " TEXT, "
            + ExamItemDao.COLUMN_NAME_ANSWER_B + " TEXT, "
            + ExamItemDao.COLUMN_NAME_ANSWER_C + " TEXT, "
            + ExamItemDao.COLUMN_NAME_ANSWER_D + " TEXT, "
            + ExamItemDao.COLUMN_NAME_WHY + " TEXT );";	
	
	private DbOpenHelper(Context context) {		
		super(context, getUserDatabaseName(), null, DATABASE_VERSION);
	}
	
	public static DbOpenHelper getInstance(Context context) {
		if (instance == null) {
			Log.d(TAG, "DbOpenHelper 单例模式");
			instance = new DbOpenHelper(context.getApplicationContext());
		}
		return instance;
	}
	
	private static String getUserDatabaseName() {
		Log.d(TAG, "创建数据库成功");
        return  "eschool.db";
    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(RULECLASS_TABLE_CREATE);
		db.execSQL(RULEITEM_TABLE_CREATE);
		db.execSQL(RULEITEMINFO_TABLE_CREATE);
		db.execSQL(EXAM_TABLE_CREATE);
		db.execSQL(EXAMITEM_TABLE_CREATE);
		
		Log.d(TAG, "创建表成功");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}
	
	public void closeDB() {
	    if (instance != null) {
	        try {
	            SQLiteDatabase db = instance.getWritableDatabase();
	            db.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        instance = null;
	    }
	}

	
}
