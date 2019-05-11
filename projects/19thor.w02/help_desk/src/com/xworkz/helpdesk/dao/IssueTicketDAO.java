package com.xworkz.helpdesk.dao;

import com.xworkz.helpdesk.entity.IssueTicketEntity;
import com.xworkz.helpdesk.exception.DAOException;

public interface IssueTicketDAO {

	public void save(IssueTicketEntity  entity) throws DAOException;

}
