package com.qsp.hibernate_crud_jpql_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteEmployeeRecordByUsingJpql {
public static void main(String[] args) {
		
		//magical object
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String jpql = "delete from Employee s where s.empid=?1";
		
		Query query = em.createQuery(jpql);
		
		
		query.setParameter(1, 101);
		
		et.begin();
		query.executeUpdate();
		et.commit();
		
}
}
