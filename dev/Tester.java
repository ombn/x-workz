package com.dev.devaapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devaapp.beans.SolarSystemBeans;

public class Tester {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new  ClassPathXmlApplicationContext("spring.xml");
	
		SolarSystemBeans beans=context.getBean(SolarSystemBeans.class);
		System.out.println(beans.getName());
		System.out.println(beans.getNoOfPlanets());
		System.out.println(beans.getSize());
		System.out.println(beans.getBeans().getName());
		System.out.println(beans.getBeans().getSize());
		beans.revolving();
	}

}
