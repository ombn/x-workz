package org.dev.devapp;

import javax.persistence.*;

@Entity
@Table(name="ticket_table")
public class TicketBookingDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String age;
	private String source;
	private String destination;
	
	
	public TicketBookingDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	

}
