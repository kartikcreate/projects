package com.qsp.simple_hibernate_project;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindRecordById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		String jpql ="select s from Student s where s.sid = 101";
		Query query=em.createQuery(jpql);
		List<Student> std =query.getResultList();
		for(Student student:std) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println("------------------------------------");
		}
		/*String jpql ="select s from Student s where s.sid = 102";
		Query query=em.createQuery(jpql);
		Student student =(Student)query.getSingleResult();
		
			System.out.println(student.getSid());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println("------------------------------------");
		*/
}
}
