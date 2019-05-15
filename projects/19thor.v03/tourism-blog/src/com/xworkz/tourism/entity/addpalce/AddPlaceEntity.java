package com.xworkz.tourism.entity.addpalce;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ADD_PLACE")
public class AddPlaceEntity implements Serializable {

	@Id
	@GenericGenerator(name="increment",strategy="increment")
	@GeneratedValue(generator="increment")
	@Column(name="PLACE_ID")
	private int palceId;
	@Column(name="PLACE")
	private String place;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="POPULAR")
	private String popular;
	@Column(name="SEASON")
	private String season;

	public AddPlaceEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public int getPalceId() {
		return palceId;
	}

	public void setPalceId(int palceId) {
		this.palceId = palceId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPopular() {
		return popular;
	}

	public void setPopular(String popular) {
		this.popular = popular;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "AddPlaceEntity [palceId=" + palceId + ", place=" + place
				+ ", state=" + state + ", country=" + country + ", description="
				+ description + ", popular=" + popular + ", season=" + season
				+ "]";
	}

}
