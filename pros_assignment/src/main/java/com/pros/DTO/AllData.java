package com.pros.DTO;

import java.util.List;

import com.pros.model.EntryData;

public class AllData {
	
	private Integer number;
	
	private List<EntryData> ed;

	public AllData() {
		super();
	}

	public AllData(Integer number, List<EntryData> ed) {
		super();
		this.number = number;
		this.ed = ed;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<EntryData> getEd() {
		return ed;
	}

	public void setEd(List<EntryData> ed) {
		this.ed = ed;
	}
	
	

}
