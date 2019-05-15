package com.xworkz.tourism.dto.addplace;

import java.io.Serializable;

public class AddPlaceDTO implements Serializable {

	private String place;
	private String state;
	private String country;
	private String description;
	private String popular;
	private String season;

	public AddPlaceDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
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
		return "AddPlaceDTO [place=" + place + ", state=" + state + ", country="
				+ country + ", description=" + description + ", popular="
				+ popular + ", season=" + season + "]";
	}
}
