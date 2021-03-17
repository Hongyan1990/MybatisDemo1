package com.mybatis.po;

public class ShoppingCar {
	private int cid;
	private String cname;
	private MyUser user;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public MyUser getUser() {
		return user;
	}
	public void setUser(MyUser user) {
		this.user = user;
	}
	
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", uid=" + user.getUid() + ", uname=" + user.getUname() + ", usex=" + user.getUsex();
	}
	
}
