package hibernate_many_one_assign;

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

	Department department=std.getTrainer();
	System.out.println(department.getTid());
	System.out.println(department.getName());
	System.out.println(department.getSubject());
}
}
