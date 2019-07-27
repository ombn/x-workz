package com.dev.devapp.test;

import com.dev.devapp.dao.ElectionDAO;
import com.dev.devapp.dto.ElectionDTO;

public class Tester {
	
	
	public static void main(String[] args) {
		
		ElectionDTO  electionDTO  = new ElectionDTO();
		electionDTO.setArea("rajajinagar");
		electionDTO.setPartyName("BJP");
		
		electionDTO.setCandidateName("Suresh");
		
		ElectionDAO dao  = new ElectionDAO();
		//dao.saveElection(electionDTO);
		dao.updateElection(3,"raja");
	//ElectionDTO dto=	dao.getElection(1);
//	dao.deleteElection();
	//System.out.println(dto);
	}

}
