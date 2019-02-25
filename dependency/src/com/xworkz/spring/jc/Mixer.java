package com.xworkz.spring.jc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mixer {

	private String brand;

	@Autowired
	public Mixer(@Value("Preeti") String brand, @Value("1200") double price) {
		this.brand = brand;
		System.out.println("Created \t" + this.getClass().getSimpleName());
		System.out.println("price \t" + price);
	}

	public String getBrand() {
		return brand;
	}

}
