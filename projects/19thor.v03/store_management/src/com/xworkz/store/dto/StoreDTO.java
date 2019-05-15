package com.xworkz.store.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "store")
public class StoreDTO implements Serializable {

	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "SID")
	private int sid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NO_OF_EMPS")
	private int noOfEmps;
	@Column(name = "STORE_TYPE")
	private String storeType;

	public StoreDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEmps() {
		return noOfEmps;
	}

	public void setNoOfEmps(int noOfEmps) {
		this.noOfEmps = noOfEmps;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	@Override
	public String toString() {
		return "StoreDTO [sid=" + sid + ", name=" + name + ", noOfEmps=" + noOfEmps + ", storeType=" + storeType + "]";
	}

}
