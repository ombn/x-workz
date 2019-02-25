package com.xworkz.spring.component;

public class ELBean {

	private String message;

	public ELBean() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public void setMessage(String message) {
		System.out.println("invoked setMessage"+message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
