package com.xworkz.relation;

import com.xworkz.relation.onetoone.SolarSystem;
import com.xworkz.relation.onetoone.Universe;

public class OnetoOneRelationTester {
	
	public static void main(String[] args) {
		
		//step 1
		Universe universe=new Universe();
		universe.setName("X-workz");
		universe.setNoOfGalaxys(4);
		universe.setSize('M');
		
		
		//step 2
		
		SolarSystem solarSystem=new SolarSystem();
		
		solarSystem.setName("Tricky way");
		solarSystem.setNoOfPlanets(1);
		solarSystem.setAgeInMillions(0);
		
		//step 3 , relation happens
		universe.setSolarSystem(solarSystem);
		
		SolarSystem refOfSolarSystem=universe.getSolarSystem();
		System.out.println(refOfSolarSystem.getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
