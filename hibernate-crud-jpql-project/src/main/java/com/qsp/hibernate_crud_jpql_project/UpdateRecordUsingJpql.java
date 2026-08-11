package com.qsp.hibernate_crud_jpql_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdateRecordUsingJpql {
public static void main(String[] args) {
		
		//magical object
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String jpql = "update Employee s set s.name=:name, s.age=:age, s.salary=:salary where s.empid=:empid";
		
		Query query = em.createQuery(jpql);
		
		query.setParameter("name", "mani");
		query.setParameter("age", 21);
		query.setParameter("salary", 12321);
		query.setParameter("empid", 101);
		
		et.begin();
		query.executeUpdate();
		et.commit();
		
}
}
