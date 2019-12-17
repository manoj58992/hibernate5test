package com.hibarnate5.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate5.utils.Hibernate5Util;
import com.hibernate5test.entities.Hibernate5Entity;

public class Hibernate5Repository {
	
	public void save(Hibernate5Entity hibernateEntity) {
		SessionFactory sessionFactory = Hibernate5Util.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(hibernateEntity);
		session.getTransaction().commit();

		session.close();
	}

}
