package hibernate_one_many_mapping_bidirectional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		/*
		 * 1.Create the Object
		 *  2.Connect the Object 
		 *  3.Save the Object
		 */
		
		// 1.Create the Object
		Trainer t1= new Trainer();
		t1.setTid(103);
		t1.setName("nausha");
		t1.setSalary(45690);
		
		Trainer t2= new Trainer();
		t2.setTid(104);
		t2.setName("sampada");
		t2.setSalary(45690);
		
		
		
		
	Student s1=new Student();
	s1.setSid(6);
	s1.setName("pavan");
	s1.setAge(21);
	
	s1.setTrainer(t1);
//	s1.setTrainer(t2);
	
	Student s2=new Student();
	s2.setSid(7);
	s2.setName("pramod");
	s2.setAge(21);
	
	s2.setTrainer(t1);
//	s2.setTrainer(t2);

	Student s3=new Student();
	s3.setSid(9);
	s3.setName("pan");
	s3.setAge(21);
	s3.setTrainer(t1);
//	s3.setTrainer(t2);
	//build a connection form both sides
	
	List<Student> std= new ArrayList<Student>();
	std.add(s3);
	std.add(s2);
	std.add(s1);
	t1.setStudents(std);
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	em.persist(t1);
	em.persist(t2);
	et.commit();
	}

}
