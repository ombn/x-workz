package com.xworkz.boot.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class MessageEntity {

	@Id
	private int mid;
	private String message;
	@Column(name="M_FROM")
	private String from;
	@Column(name="M_TO")
	private String to;

	public MessageEntity() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
