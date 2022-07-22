package com.example.demo.entity;

import lombok.Data;

@Data
public class UserData {

	private String usr_nm;
	private String usr_cmt;

	public String getUsr_nm() {
		return usr_nm;
	}
	public void setUsr_nm(String usr_nm) {
		this.usr_nm = usr_nm;
	}
	public String getUsr_cmt() {
		return usr_cmt;
	}
	public void setUsr_cmt(String usr_cmt) {
		this.usr_cmt = usr_cmt;
	}

}
