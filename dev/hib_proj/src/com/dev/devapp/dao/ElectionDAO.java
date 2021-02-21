package com.dev.devapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.devapp.HibernateUtil;
import com.dev.devapp.dto.ElectionDTO;

public class ElectionDAO {
	
	public ElectionDAO() {

		System.out.println(this.getClass().getSimpleName() + "created");
	}

	SessionFactory factory=HibernateUtil.getFactory();
	
	public void saveElection(ElectionDTO dto) {
		 factory = HibernateUtil.getFactory();
	
		 Session session = factory.openSession();
		// Session session1 = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();

	}

	public ElectionDTO getElection(int id) {

		Session session = HibernateUtil.getFactory().openSession();
		ElectionDTO dto = session.get(ElectionDTO.class, id);
		session.close();
		// factory.close();
		return dto;
	}

	public void deleteElection() {

		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ElectionDTO dto = session.get(ElectionDTO.class, 1);
		session.delete(dto);
		transaction.commit();
		session.close();

	}
	
	public void updateElection(int id , String candidateName){
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ElectionDTO dto = session.get(ElectionDTO.class, id);
	if(dto !=null)
	{
		dto.setCandidateName(candidateName);
		session.update(dto);
		
	}
		transaction.commit();
		session.close();
		
	}

}
