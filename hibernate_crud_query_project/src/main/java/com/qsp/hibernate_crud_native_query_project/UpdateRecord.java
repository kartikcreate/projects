package com.qsp.hibernate_crud_native_query_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdateRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		String sql = "update product set pname=:name, price=:price where pid=:pid";
		
		Query query=em.createNativeQuery(sql);
		
		
		query.setParameter("name", "pen");
		query.setParameter("price", 1234);
		query.setParameter("pid", 102);		
		et.begin();
		query.executeUpdate();
		et.commit();
		
				
	}
}
