package com.eschool.app.domain;


public class User {
	private int unreadMsgCount;	//未读消息数
	private String header;		//头像
    private String usernick;	//昵称
    private String sex;			//性别	
    private String tel;			//联系方式
    private String fxid;		
    private String region;		//区域
    private String avatar;		
    private String sign;		
    private String beizhu;		//备注
 
    
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public int getUnreadMsgCount() {
		return unreadMsgCount;
	}

	public void setUnreadMsgCount(int unreadMsgCount) {
		this.unreadMsgCount = unreadMsgCount;
	}
	
	public void setNick(String usernick){
	    this.usernick=usernick;
	}
	public String getNick(){
	    return usernick;
	}
	public void setAvatar(String avatar){
        this.avatar=avatar;
    }
    public String getAvatar(){
        return avatar;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public String getTel(){
        return tel;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
    public void setFxid(String fxid) {
        this.fxid = fxid;
    }

    public String getFxid() {
        return fxid;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getBeizhu() {
        return beizhu;
    }

}
