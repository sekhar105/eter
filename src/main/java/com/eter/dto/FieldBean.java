package com.eter.dto;

public class FieldBean {

	private int id;
	private String name;
	private String starttime;
	private String endtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public FieldBean(int id, String name, String starttime, String endtime) {
		super();
		this.id = id;
		this.name = name;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	public FieldBean() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FieldBean [id=" + id + ", name=" + name + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}
	
	
	
}
