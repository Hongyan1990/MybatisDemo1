package com.mybatis.po;

public class Reply {
	private int rid;
	private String dec;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
	
	public String toString() {
		return "rid=" + rid + ", dec=" + dec;
	}
}
