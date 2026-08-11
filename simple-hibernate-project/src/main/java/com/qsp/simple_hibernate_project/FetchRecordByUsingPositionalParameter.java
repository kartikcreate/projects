package com.qsp.simple_hibernate_project;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchRecordByUsingPositionalParameter {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		String jpql ="select s from Student s where s.sid=?1";
		
		Query query=em.createQuery(jpql);
		//send value to the query
		
		query.setParameter(1, 101);
		
		Student student = (Student)query.getSingleResult();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println("------------------------------------");
		
		}
}

