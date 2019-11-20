package com.xworkz.relation.onetoone;

public class SolarSystem {

	private int noOfPlanets;
	private String name;
	private int ageInMillions;
	
	public SolarSystem() {
	System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	public int getNoOfPlanets() {
		return noOfPlanets;
	}
	public void setNoOfPlanets(int noOfPlanets) {
		this.noOfPlanets = noOfPlanets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgeInMillions() {
		return ageInMillions;
	}
	public void setAgeInMillions(int ageInMillions) {
		this.ageInMillions = ageInMillions;
	}
	
	// get==read & set==write accessor's & mutator's
	
	

}
