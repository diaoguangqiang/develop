package com.eschool.app.domain;

/*
 * ruleclass: id, name (标识，名字)
 * ruleitem: id, pid, name (标识，父标识，名字)
 * ruleiteminfo: id, pid, content (标识， 父标识，名字)
*/
public class RuleItemInfo {

	private String id;
	private String pid;
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
