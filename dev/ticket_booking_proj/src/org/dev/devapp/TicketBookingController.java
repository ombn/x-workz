package org.dev.devapp;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class TicketBookingController {
	
	public TicketBookingController() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	@Autowired
	private SessionFactory factory;
	
	
	@RequestMapping(value="/ticketBooking.do", method=RequestMethod.POST)
	public String  ticketBooking(@ModelAttribute TicketBookingDTO bookingDTO,
			HttpServletRequest req){
	String name= 	bookingDTO.getName();
	String source=bookingDTO.getSource();
	String destination = bookingDTO.getDestination();
	String age=bookingDTO.getAge();
	
	TicketBookingDTO bookingDTO2 = new TicketBookingDTO();
	bookingDTO2.setAge(age);
	bookingDTO2.setDestination(destination);
	bookingDTO2.setSource(source);
	bookingDTO2.setName(name);
	Session session = factory.openSession();
	Transaction tx  =session.beginTransaction();
	session.save(bookingDTO);
	tx.commit();
	
	
		req.setAttribute("nm", name);
		req.setAttribute("src", source);
		req.setAttribute("dest", destination);
		return "/ticketBooking.jsp";
	}
	

}
