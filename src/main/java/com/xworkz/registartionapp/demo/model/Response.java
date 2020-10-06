package com.xworkz.registartionapp.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Response {
	
	private String message;

	@JsonInclude(Include.NON_NULL)
	private List<SavedObjects> dataList;
	
	@JsonInclude(Include.NON_NULL)
	private List<Object> storedDataList;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String errorMessage) {
		this.message = errorMessage;
	}

	public List<SavedObjects> getDataList() {
		return dataList;
	}

	public void setDataList(List<SavedObjects> dataList) {
		this.dataList = dataList;
	}

	public List<Object> getStoredDataList() {
		return storedDataList;
	}

	public void setStoredDataList(List<Object> storedDataList) {
		this.storedDataList = storedDataList;
	}

}
