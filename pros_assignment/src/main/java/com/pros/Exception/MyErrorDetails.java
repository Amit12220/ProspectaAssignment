package com.pros.Exception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private  LocalDateTime  ldt;
	
	private String message;
	
	private String desc;

	public MyErrorDetails() {
		super();
	}

	public MyErrorDetails(LocalDateTime ldt, String message, String desc) {
		super();
		this.ldt = ldt;
		this.message = message;
		this.desc = desc;
	}

	public LocalDateTime getLdt() {
		return ldt;
	}

	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
}
