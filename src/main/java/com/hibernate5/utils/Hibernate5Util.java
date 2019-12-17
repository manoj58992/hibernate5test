package com.hibernate5.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate5Util {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

}
