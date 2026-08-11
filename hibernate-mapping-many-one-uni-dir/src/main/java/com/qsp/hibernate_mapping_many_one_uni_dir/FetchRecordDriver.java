package com.qsp.hibernate_mapping_many_one_uni_dir;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchRecordDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	Student std=em.find(Student.class,111);
	System.out.println();
	System.out.println(std.getSid());
	System.out.println(std.getName());
	System.out.println(std.getAge());

	Trainer trainer=std.getTrainer();
	System.out.println(trainer.getTid());
	System.out.println(trainer.getName());
	System.out.println(trainer.getSubject());
}
}
