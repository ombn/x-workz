package com.xworkz.spring.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SalesRep {

	@Value("ENG")
	private String language;

	// skill, lang

	public SalesRep() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean sell(String product) {
		System.out.println("rep knows lang : \t"+this.language);
		System.out.println("rep sold \t" + product);
		return true;
	}

}
