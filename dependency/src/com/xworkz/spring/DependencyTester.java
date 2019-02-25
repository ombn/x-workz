package com.xworkz.spring;

import com.xworkz.spring.component.Driver;
import com.xworkz.spring.component.Health;
import com.xworkz.spring.component.Transport;

public class DependencyTester {

	public static void main(String[] args) {

		Health health = new Health();
		health.setBloodGroup("O+");
		health.setSugarLevel(119);

		Driver driver = new Driver("KA-01-7686");
		driver.setExp(15);
		driver.setHealth(health);

		String transportName = new String("VRL");
		String transportType = new String("Goods");
		String transportTypePassenger = new String("Passenger");

		Transport transportGoods = new Transport(transportName, driver);
		transportGoods.setType(transportType);

		Transport transportPassenger = new Transport(transportName, driver);
		transportPassenger.setType(transportTypePassenger);

		transportGoods.transporting();
		transportPassenger.transporting();

		Thread thread = new Thread();
		thread.setName("Test");
		thread.setDaemon(false);
		thread.setPriority(5);

	}

}
