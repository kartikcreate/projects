package com.qsp.employee_hibernate_project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;




	public class UpdateRecord {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("db-config");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Employee std=em.find(Employee.class,103);
			std.setName("chaand");
			std.setAge(24);
			et.begin();
			em.merge(std);
			System.out.println("data is updated");
			et.commit();
			
		}

	}


