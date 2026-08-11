package com.qsp.hibernate_one_one_mapping_uni_dir;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteRecord {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//step 1:Fetch parent and mark foreign key as null
		Car c = em.find(Car.class, 101);
		
		//break the connection 
		c.setEngine(null);
		
		//fetch the child
		Engine e= em.find(Engine.class, 1);
		
		et.begin();
		em.merge(c);
		em.remove(e);
		et.commit();
		
	}
}
