package com.xworkz.helpdesk.dto;

import java.io.Serializable;

public class IssueTicketDTO implements Serializable {

	private String name;
	private String product;
	private Long mobile;
	private String issueType;
	private String description;

	public IssueTicketDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "IssueTicketDTO [name=" + name + ", product=" + product + ", mobile=" + mobile + ", issueType="
				+ issueType + ", description=" + description + "]";
	}
}
