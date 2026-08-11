package com.qsp.hibernate_crud_native_query_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		String delete = "delete from product where pid=?";
		
		Query query=em.createNativeQuery(delete);
		
		query.setParameter(1, 101);
		et.begin();
		query.executeUpdate();
		et.commit();
				
	}
	
}
