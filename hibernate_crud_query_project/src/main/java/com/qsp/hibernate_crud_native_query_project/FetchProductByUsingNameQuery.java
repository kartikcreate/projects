package com.qsp.hibernate_crud_native_query_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchProductByUsingNameQuery {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		Query query=em.createNamedQuery("Product.findProductById");
		
		query.setParameter("pid", 102);
		Product product=(Product)query.getSingleResult();
		System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getPrice());
		System.out.println(product.getQuantity());		
	}
	}

