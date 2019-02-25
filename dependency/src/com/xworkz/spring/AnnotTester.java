package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.annot.Showroom;

public class AnnotTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext(
				"resources/spring-annot.xml");

		System.out.println(container.getBeanDefinitionCount());

		Showroom refOfShowroom = container.getBean(Showroom.class);
		
		System.out.println(refOfShowroom.getType());
		
		refOfShowroom.selling("City", 160.0);

	}

}
