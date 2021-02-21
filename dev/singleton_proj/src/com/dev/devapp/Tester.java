package com.dev.devapp;

import org.hibernate.SessionFactory;

public class Tester {
	
	public static void main(String[] args) {
		
SessionFactory factory = HibernateUtil.getFactory();
System.out.println(factory);

SessionFactory factory1 = HibernateUtil.getFactory();
System.out.println(factory1);
	}

}
