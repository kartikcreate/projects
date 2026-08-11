package com.qsp.hibernate_crud_native_query_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		String sql = "insert into product values(?,?,?,?)";
		
		Query query=em.createNativeQuery(sql);
		
		query.setParameter(1, 103);
		query.setParameter(2, "laptop2");
		query.setParameter(3, 9876);
		query.setParameter(4, 2);
		
		et.begin();
		query.executeUpdate();
		et.commit();
		
				
	}

}
