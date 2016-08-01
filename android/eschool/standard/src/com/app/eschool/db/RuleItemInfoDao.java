package com.app.eschool.db;

/*
 * ruleclass: id, name (标识，名字)
 * ruleitem: id, pid, name (标识，父标识，名字)
 * ruleiteminfo: id, pid, content (标识， 父标识，名字)
*/
public class RuleItemInfoDao {

	public static final String TABLE_NAME = "rule_item_info";
	public static final String COLUMN_NAME_ID = "id";
	public static final String COLUMN_NAME_PID = "pid";
    public static final String COLUMN_NAME_CONTENT = "content";
}
