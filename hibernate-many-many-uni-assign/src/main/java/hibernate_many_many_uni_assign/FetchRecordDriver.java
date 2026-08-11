package hibernate_many_many_uni_assign;


import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchRecordDriver {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student std=em.find(Student.class,102);
		System.out.println();
		System.out.println(std.getSid());
		System.out.println(std.getName());
		System.out.println(std.getAge());

		List<Subject> sub=std.getSubject();
		for(Subject subject:sub) {
		System.out.println(subject.getId());
		System.out.println(subject.getSname());
		System.out.println(subject.getDays());
		}
		
		
		
		
		
		
}
}
