package com.xworkz.spring.component;

public class Driver {

	private String dlNo;
	private int exp;
	private Health health;

	public Driver(String dlNo) {
		System.out.println("Created \t" + this.getClass().getSimpleName());
		this.dlNo = dlNo;
	}

	public void drive() {
		System.out.println("invoked drive()");
		boolean isActive = health.beingActive();
		if (isActive)
			System.out.println("can drive");
		else
			System.out.println("cannot drive");
	}

	public void setExp(int exp) {
		System.out.println("invoked setExp");
		this.exp = exp;
	}
	
	public void setHealth(Health health) {
		System.out.println("invoked setHealth");
		this.health = health;
	}

}
