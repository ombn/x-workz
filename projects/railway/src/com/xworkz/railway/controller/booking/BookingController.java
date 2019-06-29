package com.xworkz.railway.controller.booking;

import java.awt.RadialGradientPaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.railway.dto.booking.BookingDTO;
import com.xworkz.railway.service.booking.BookingService;
import com.xworkz.railway.service.booking.BookingServiceImpl;

@Component
@RequestMapping("/")
public class BookingController {

	@Autowired // ref of service
	@Qualifier("bookingServiceImpl")
	private BookingService bookingService;

	public BookingController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/bookticket.do", method = RequestMethod.POST)
	public String onBooking(@ModelAttribute BookingDTO bookingDTO) {

		System.out.println("invoked booking \t");
		System.out.println("booking dto" + bookingDTO);
		boolean decide = bookingService.bookTicket(bookingDTO);
		if (decide) {
			System.out.println("booking success");
		} else {
			System.out.println("booking failure");
		}
		return "/Booking.jsp";
	}

}
