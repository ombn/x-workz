package com.xworkz.relation.onetoone;

public class Universe {

	//encapsulation
	private String name;
	private int noOfGalaxys;
	private char size;
	
	private SolarSystem solarSystem;
	
	public Universe() {
	System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfGalaxys() {
		return noOfGalaxys;
	}
	public void setNoOfGalaxys(int noOfGalaxys) {
		this.noOfGalaxys = noOfGalaxys;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}

	public SolarSystem getSolarSystem() {
		return solarSystem;
	}

	public void setSolarSystem(SolarSystem solarSystem) {
		this.solarSystem = solarSystem;
	}
	
	

}
