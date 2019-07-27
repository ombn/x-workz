package com.dev.devapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	
	private static SessionFactory factory= null;
	
	public static SessionFactory getFactory(){
	return 	factory;
	}
	
	
	static
	{
		Configuration configuration = new Configuration();
		configuration.configure();
	factory	=configuration.buildSessionFactory();
	}

}
