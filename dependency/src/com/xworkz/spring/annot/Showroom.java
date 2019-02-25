package com.xworkz.spring.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hondaShowroom")
public class Showroom {

	@Value("${car.type}")
	private String type;
	private SalesRep salesRep;
	@Autowired
	private Manager manager;

	@Autowired
	public Showroom(SalesRep salesRep) {
		System.out.println("Created \t" + this.getClass().getSimpleName());
		this.salesRep = salesRep;
	}

	public void selling(String carName, Double price) {
		System.out
				.println(manager.getNoOfBranchesManaged() + "Manager branches");
		if (carName != null && price != null) {
			if (price > 100) {
				System.out.println("sold car \t" + carName);
				salesRep.sell(carName);

				return;
			}
		}
		System.out.println("car is not sold");
	}

	public String getType() {
		return type;
	}

}
