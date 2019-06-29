package com.xworkz.railway.dto.booking;

public class BookingDTO {

	private String source;
	private String destination;
	private String doj;
	private String passenger;
	private String classType;

	public BookingDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
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

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getPassenger() {
		return passenger;
	}

	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}



	@Override
	public String toString() {
		return "BookingDTO [source=" + source + ", destination=" + destination + ", doj=" + doj + ", passenger="
				+ passenger + ", classType=" + classType + "]";
	}

}
