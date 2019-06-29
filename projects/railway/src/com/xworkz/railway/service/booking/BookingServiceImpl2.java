package com.xworkz.railway.service.booking;

import org.springframework.stereotype.Component;

import com.xworkz.railway.dto.booking.BookingDTO;

@Component("bookingServiceImpl")
public class BookingServiceImpl2 implements BookingService {

	@Override
	public boolean bookTicket(BookingDTO bookingDTO) {
		System.out.println("new impl of service");
		return false;
	}

}
