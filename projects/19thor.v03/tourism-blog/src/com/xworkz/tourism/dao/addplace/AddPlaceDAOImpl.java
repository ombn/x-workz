package com.xworkz.tourism.dao.addplace;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.tourism.entity.addpalce.AddPlaceEntity;
import com.xworkz.tourism.exception.DAOException;

@Repository
public class AddPlaceDAOImpl implements AddPlaceDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public AddPlaceDAOImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public Integer save(AddPlaceEntity entity) throws DAOException {
		System.out.println("invoked save in dao, should impl JPA");
		System.out.println("entity \t" + entity);
		Session session = null;
		Integer pk = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			pk = (Integer) session.save(entity);
			transaction.commit();
			return pk;
		} catch (HibernateException | NullPointerException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw new DAOException(e.getMessage());
		} finally {
			session.close();
		}

		
	}

}
