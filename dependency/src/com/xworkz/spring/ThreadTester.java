package com.xworkz.spring;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ThreadTester {

	public static void main(String[] args) throws SQLException {
		ApplicationContext container = new ClassPathXmlApplicationContext(
				"resources/spring-config.xml");

		Thread refOfThread = container.getBean(Thread.class);
		System.out.println(refOfThread);

		DataSource dataSource = container
				.getBean(DriverManagerDataSource.class);

		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();

	}

}
