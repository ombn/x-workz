package com.dev.devapp.test;

import java.util.List;

import com.dev.devapp.dao.SportsDAO;
import com.dev.devapp.dto.SportsDTO;

public class Tester {
	
	public static void main(String[] args) {
		
		
		SportsDTO dto =  new SportsDTO();
		dto.setCountry("NEWZealand");
		dto.setSportsName("Cricket");
		dto.setNoOfPlayers(11);
		dto.setSportsType("Outdoor");
		
		
		SportsDAO dao = new SportsDAO();
		//dao.saveSports(dto);
	List<SportsDTO> dto2 = 	dao.getSportsBySportsName();
	dto2.forEach(System.out::println);
	System.out.println(dto2);
	/*for (SportsDTO sportsDTO : dto2) {
		System.out.println(sportsDTO);

		
	}*/
	
	}
}
