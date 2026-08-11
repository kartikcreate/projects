package com.qsp.hibernate_mapping_many_many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProgramAttachExisitingObject {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Department std = new Department();
		std.setSid(222);
		std.setName(null);
		std.setAge(22);
		Subject javaObj = em.find(Subject.class, 102);
		Subject htmlObj = em.find(Subject.class, 102);

		List<Subject> sub = new ArrayList<Subject>();
		sub.add(javaObj);
		sub.add(htmlObj);
		std.setSubject(sub);

	}
}
