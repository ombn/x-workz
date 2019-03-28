package com.xworkz.store.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.store.dto.StoreDTO;

public class StoreDAO implements IStoreDAO {

	public StoreDAO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public Integer insert(StoreDTO storeDTO) {
		System.out.println("invoked insert from \t" + this.getClass().getSimpleName());
		SessionFactory refOfSF = null;
		Session refOfSession = null;
		Integer id = null;
		try {
			System.out.println("Should save \t" + storeDTO);
			Configuration configuration = new Configuration();
			configuration.configure("resources/mysql.xml");// loading config
															// info
			configuration.addAnnotatedClass(StoreDTO.class);// loading mapping
															// info
			refOfSF = configuration.buildSessionFactory();// creating SF
															// instance

			refOfSession = refOfSF.openSession();
			Transaction refOfTX = refOfSession.beginTransaction();
			System.out.println("started tx for saving");
			id = (Integer) refOfSession.save(storeDTO);
			System.out.println("saving success");
			refOfTX.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("closing all the resources");
			refOfSession.close();
			refOfSF.close();
		}
		return id;

	}

	@Override
	public StoreDTO getById(int id) {
		SessionFactory factory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("resources/mysql.xml");
			configuration.addAnnotatedClass(StoreDTO.class);
			factory = configuration.buildSessionFactory();
			session = factory.openSession();
			System.out.println("getting entity by id \t " + id);
			StoreDTO entityFromDB = session.get(StoreDTO.class, id);
			if (entityFromDB != null) {
				System.out.println("entity found");
				return entityFromDB;
			} else {
				System.out.println("entity not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
		return null;
	}

}
