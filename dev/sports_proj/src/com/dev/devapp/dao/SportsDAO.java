package com.dev.devapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.devapp.HibernateUtil;
import com.dev.devapp.dto.SportsDTO;


public class SportsDAO {
	
	
	public SportsDAO() {
		System.out.println("created");
	}

	
	public void saveSports(SportsDTO dto)
	{
		/*Configuration configuration  =new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(SportsDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction  = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();*/
		
		Session session=HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		//tx.commit();
		session.close();
		
		
		
	}
	
	public SportsDTO getSportsBySportsName(String sportsName){
		String hql="select st from SportsDTO st where sportsName='"+sportsName+"'";
		Session session=HibernateUtil.getFactory().openSession();
		Query query =session.createQuery(hql);
		SportsDTO dto =  (SportsDTO) query.uniqueResult();
		//SportsDTO sportsDTO=	(SportsDTO)dto;
		return dto;
		
 	}
	
	public List<SportsDTO> getSportsBySportsName(){
		String hql="from SportsDTO";
		Session session=HibernateUtil.getFactory().openSession();
		Query query =session.createQuery(hql);
		List<SportsDTO> dto =  query.list();
		//SportsDTO sportsDTO=	(SportsDTO)dto;
		return dto;
		
 	}
}
