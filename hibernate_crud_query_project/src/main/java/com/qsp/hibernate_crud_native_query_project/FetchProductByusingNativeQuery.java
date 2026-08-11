package com.qsp.hibernate_crud_native_query_project;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchProductByusingNativeQuery {
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
	EntityManager em = emf.createEntityManager();

	//// using native query
//	//	Query query=em.createNamedQuery("Product.findAll");
////	List<Product>prod=query.getResultList();
////	
////	for(Product product:prod) {
////		System.out.println(product.getPid());
////
////		System.out.println(product.getPname());
////		System.out.println(product.getPrice());
////		System.out.println(product.getQuantity());		
//}
	Query query=em.createNamedQuery("Product.findAll");
	List<Product>prod=query.getResultList();
	
	for(Product product2:prod) {
		System.out.println(product2.getPid());

		System.out.println(product2.getPname());
		System.out.println(product2.getPrice());
		System.out.println(product2.getQuantity());		
	}
}
}