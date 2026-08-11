package com.qsp.simple_hibernate_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecordDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("db-config");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//create the student object 
		Student std=new Student();
		std.setId(104);
		std.setName("rriya");
		std.setAge(23);
		et.begin();
		em.persist(std);
		
		System.out.println("data is inserted");
		et.commit();
	}

}
