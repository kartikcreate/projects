package com.qsp.hibernate_one_one_mapping_uni_dir;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateRecord {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	//step1: fetch parent
	Car c=em.find(Car.class,102);
//update parent car
	c.setName("maruthi-800");
	c.setPrice(34334);
	Engine e=c.getEngine();
	e.setType("disel");
	e.setHp("899hp");
	et.begin();
	em.merge(c);
	em.merge(e);
	et.commit();
}
}
