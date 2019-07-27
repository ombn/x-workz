package com.dev.devapp.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SportsDTO implements Serializable
{
	@Id
	/*@GenericGenerator(name="ref" , strategy="increment")
	@GeneratedValue(generator="ref")*/
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sportsId;
	private String sportsName;
	private String sportsType;
	private String country;
	private int noOfPlayers;
	
	
	
	
	
	
	public SportsDTO() {
		// TODO Auto-generated constructor stub
	}






	public int getSportsId() {
		return sportsId;
	}






	public void setSportsId(int sportsId) {
		this.sportsId = sportsId;
	}






	public String getSportsName() {
		return sportsName;
	}






	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}






	public String getSportsType() {
		return sportsType;
	}






	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}






	public String getCountry() {
		return country;
	}






	public void setCountry(String country) {
		this.country = country;
	}






	public int getNoOfPlayers() {
		return noOfPlayers;
	}






	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}






	@Override
	public String toString() {
		return "SportsDTO [sportsId=" + sportsId + ", sportsName=" + sportsName + ", sportsType=" + sportsType
				+ ", country=" + country + ", noOfPlayers=" + noOfPlayers + "]";
	}

}
