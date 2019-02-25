package com.xworkz.spring.component;

public class Health {

	private String bloodGroup;
	private double sugarLevel;

	public Health() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean beingActive() {

		System.out.println("invoked beingActive()");
		System.out.println("blood group is \t" + this.bloodGroup);
		if (sugarLevel == 0)
			throw new IllegalArgumentException("sugar level cannot be zero");
		if (sugarLevel > 118 && sugarLevel < 122) {
			System.out.println("health is active");
			return Boolean.TRUE;
		}
		System.out.println("health is not active");
		return Boolean.FALSE;

	}

	public void setBloodGroup(String bloodGroup) {
		System.out.println("invoked setBloodGroup");
		this.bloodGroup = bloodGroup;
	}

	public void setSugarLevel(double sugarLevel) {
		System.out.println("invoked setSugarLevel");
		this.sugarLevel = sugarLevel;
	}

}
