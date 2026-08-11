package com.qsp.hibernate_mapping_many_many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecordDriver {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	Department std =new Department();
	std.setSid(102);
	std.setName("pavan");
	std.setAge(22);
	
	Subject sub1=new Subject();
	sub1.setId(2);
	sub1.setSname("sql");
	sub1.setDays(20);
	
	
	
	Subject sub2=new Subject();
	sub2.setId(12);
	sub2.setSname("html");
	sub2.setDays(20);
	
	
	Subject sub3=new Subject();
	sub3.setId(14);
	sub3.setSname("hubernate");
	sub3.setDays(20);
	
	
	List<Subject> sublist=new ArrayList<Subject>();
	sublist.add(sub1);
	sublist.add(sub2);
	sublist.add(sub3);
	 
	std.setSubject(sublist);
	
	
	
	et.begin();
	em.persist(std);
	em.persist(sub3);
	em.persist(sub2);
	em.persist(sub1);
et.commit();
}   
}
