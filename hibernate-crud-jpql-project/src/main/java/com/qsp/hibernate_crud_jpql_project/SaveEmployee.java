package com.qsp.hibernate_crud_jpql_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		
		//magical object
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//create employee object
		
		Employee emp = new Employee();
		emp.setEmpid(101);
		emp.setName("poda");
		emp.setAge(22);
		emp.setSalary(98765542);
		
		//save object
		et.begin();
		em.persist(emp);
		System.out.println("data is inserted");
		et.commit();
	}
}
