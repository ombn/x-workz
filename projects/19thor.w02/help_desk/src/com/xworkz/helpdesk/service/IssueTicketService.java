package com.xworkz.helpdesk.service;

import com.xworkz.helpdesk.dto.IssueTicketDTO;
import com.xworkz.helpdesk.exception.ServiceException;

public interface IssueTicketService {
	
	
	public void validateAndSave(IssueTicketDTO dto) throws ServiceException;

}
