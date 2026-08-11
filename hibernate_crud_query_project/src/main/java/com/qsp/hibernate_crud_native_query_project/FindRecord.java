package com.qsp.hibernate_crud_native_query_project;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		
		String sql = "select * from product";
		
		Query query = em.createNativeQuery(sql,Product.class);
		
		List<Product>list = query.getResultList();
		
		for(Product product:list) {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getPrice());
			System.out.println(product.getQuantity());
			System.out.println("-------product details--------");
		}
	}
}
