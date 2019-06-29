package com.xworkz.railway.service.booking;

import org.springframework.stereotype.Component;

import com.xworkz.railway.dto.booking.BookingDTO;

@Component("serviceImpl")
public class BookingServiceImpl implements BookingService{

	public BookingServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean bookTicket(BookingDTO bookingDTO) {
		System.out.println("invoked book ticket service");
		if (bookingDTO != null) {
			System.out.println("valid data, can save");
			return true;
		}
		System.out.println("invalid data, cannot save");
		return false;
	}

}
