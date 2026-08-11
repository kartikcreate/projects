package com.qsp.employee_hibernate_project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("db-config");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee std=em.find(Employee.class,103);
		et.begin();
		em.remove(std);
		System.out.println("data is deleted");
		et.commit();
}
}
