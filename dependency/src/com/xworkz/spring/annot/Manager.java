package com.xworkz.spring.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {

	@Value("${branches.managed}")
	private int noOfBranchesManaged;

	public Manager() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	
	public int getNoOfBranchesManaged() {
		return noOfBranchesManaged;
	}

}
