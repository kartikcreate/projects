package hibernate_many_one_assign;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecordDriver {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Department department=new Department ();
		department.setTid(1);
		department.setName("naushadh");
		department.setSubject("science");
		
		Student std1=new Student();
		std1.setSid(111);
		std1.setName("muk");
		std1.setAge(23);
		//connect trainer with student
		std1.setTrainer(department);
		
		
		Student std3=new Student();
		
		std3.setSid(113);
		std3.setName("kuk");
		std3.setAge(24);
		//connect trainer with student
		std3.setTrainer(department);
		
		
		
Student std2=new Student();
		
		std2.setSid(112);
		std2.setName("uk");
		std2.setAge(24);
		//connect trainer with student
		std2.setTrainer(department);
		
		//save the object
		et.begin();
		em.persist(department);
		em.persist(std2);
		em.persist(std1);
		et.commit();
		
}
}
