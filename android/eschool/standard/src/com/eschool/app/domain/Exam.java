package com.eschool.app.domain;

/*
 * 题库类型：计算机系，外语系，历史系等等
 */
public class Exam {
	private String id;
	private String unreadMsgCount;
	private String header;
    private String name;
    private String num;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUnreadMsgCount() {
		return unreadMsgCount;
	}
	public void setUnreadMsgCount(String unreadMsgCount) {
		this.unreadMsgCount = unreadMsgCount;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
    
}
