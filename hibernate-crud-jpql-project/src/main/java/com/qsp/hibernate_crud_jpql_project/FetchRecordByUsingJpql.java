package com.qsp.hibernate_crud_jpql_project;

import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchRecordByUsingJpql {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		String jpql ="select e from Employee e";
		Query query=em.createQuery(jpql);
		List<Employee> std =query.getResultList();
		for(Employee emp:std) {
			System.out.println(emp.getEmpid());
			System.out.println(emp.getName());
			System.out.println(emp.getAge());
			System.out.println(emp.getSalary());
			System.out.println("------------------------------------");
		}
}
}
