package com.xworkz.helpdesk.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.helpdesk.dao.IssueTicketDAO;
import com.xworkz.helpdesk.dto.IssueTicketDTO;
import com.xworkz.helpdesk.entity.IssueTicketEntity;
import com.xworkz.helpdesk.exception.DAOException;
import com.xworkz.helpdesk.exception.ServiceException;

@Service
public class IssueTicketServiceImpl implements IssueTicketService {

	@Autowired
	private IssueTicketDAO issueTicketDAO;

	public IssueTicketServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public void validateAndSave(IssueTicketDTO dto) throws ServiceException {
		try {

			System.out.println("invoked save from issue ticket service..");
			if (dto != null) {
				if (dto.getName() != null && !dto.getName().isEmpty() && dto.getName().length() > 4
						&& dto.getName().length() < 10) {
					System.out.println("valid data , will save into db using dao");
					IssueTicketEntity entity = new IssueTicketEntity();
					BeanUtils.copyProperties(dto, entity);// dojo mapper
					System.out.println("copied values from dto to entity and passing this to dao");
					issueTicketDAO.save(entity);
				} else {
					System.out.println("invalid data, check name constraints...");
				}
			}
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
		}

	}

}
