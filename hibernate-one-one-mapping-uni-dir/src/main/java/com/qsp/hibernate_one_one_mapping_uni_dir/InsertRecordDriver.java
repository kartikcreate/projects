package com.qsp.hibernate_one_one_mapping_uni_dir;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecordDriver {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	///1.create the object 
	//2.connect the object
	//3. save the object
	
//	1.create the object
	 Engine engine=new Engine();
	
	 engine.setEid(1);
	 engine.setType("cng");
	 engine.setHp("100hp");
	 
	 Car car=new Car();
	 car.setCid(102);
	 car.setName("nexa");
	 car.setPrice(2342);
	 ///2.connect the object 
	 car.setEngine(engine);
	 //3.save the object
	 et.begin();
	 em.persist(car);
	 em.persist(engine);
	 et.commit();
	}
}
