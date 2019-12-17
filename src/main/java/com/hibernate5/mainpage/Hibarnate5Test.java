package com.hibernate5.mainpage;

import com.hibarnate5.repositories.Hibernate5Repository;
import com.hibernate5test.entities.Hibernate5Entity;

public class Hibarnate5Test {

	public static void main(String[] args) {
		
		Hibernate5Repository hibernateRepository = new Hibernate5Repository();
		
		Hibernate5Entity h = new Hibernate5Entity();
		
		h.setName("Suntrust");
		h.setPhone(9292029029L);
		h.setType("Auto");
		h.setAddress("3044 hungton street");
		
		hibernateRepository.save(h);

	}

}
