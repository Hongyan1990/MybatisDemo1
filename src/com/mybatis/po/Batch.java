package com.mybatis.po;

import java.util.Date;
import java.util.List;

public class Batch {
	private int batch_id;
	private int cus_id;
	private int number;
	private Date createtime;
	private String note;
	private List<BatchDetail> batchDetails;
	
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<BatchDetail> getBatchDetails() {
		return batchDetails;
	}
	public void setBatchDetails(List<BatchDetail> batchDetails) {
		this.batchDetails = batchDetails;
	}
	
	
}
