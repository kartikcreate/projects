package com.qsp.simple_hibernate_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FindRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("db-config");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Student std=em.find(Student.class,103);
		System.out.println("-----------------student details--------");
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getAge());
et.commit();
// select operation will auto comit hence it is not required to write the above line 
	}

}
