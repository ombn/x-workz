package com.xworkz.helpdesk.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.helpdesk.dao.IssueTicketDAO;
import com.xworkz.helpdesk.entity.IssueTicketEntity;
import com.xworkz.helpdesk.exception.DAOException;

@Repository
public class IssueTicketDAOImpl implements IssueTicketDAO {

	@Autowired
	private SessionFactory factory;

	public IssueTicketDAOImpl() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@Override
	public void save(IssueTicketEntity entity) throws DAOException {
		Session session = null;
		try {
			System.out.println("invoked save in dao...");
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw new DAOException("Exception saving in DAO" + e.getMessage());
		} finally {
			session.close();
		}

	}

}
