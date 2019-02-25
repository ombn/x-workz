package com.xworkz.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.jc.Army;
import com.xworkz.spring.jc.Mixer;

public class AnnotationTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext(
				"resources/spring-annot.xml");
		System.out.println(container.getBeanDefinitionCount());

		Army refOfArmy = container.getBean(Army.class);

		refOfArmy.serving();
		
		
		Mixer mixer=container.getBean(Mixer.class);
		System.out.println(mixer.getBrand());
		
		
		
		
		
		
		

	}

}
