package com.mybatis.po;

import java.util.List;

public class Goods {
	private int gid;
	private String gname;
	private String gprice;
	private List<Reply> replys;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public List<Reply> getReplys() {
		return replys;
	}
	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}
	
	public String toString() {
		String replyStr = "";
		for(Reply r: replys) {
			replyStr += r;
		}
		return "gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + ", reply=" + replyStr;
	}
}
