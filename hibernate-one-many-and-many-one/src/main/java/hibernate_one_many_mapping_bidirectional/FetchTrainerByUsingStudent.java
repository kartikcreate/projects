package hibernate_one_many_mapping_bidirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchTrainerByUsingStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		Student student=em.find(Student.class,1);
		System.out.println(student.getSid());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		Trainer tra=student.getTrainer();

			System.out.println(tra.getTid());
			System.out.println(tra.getName());
			System.out.println(tra.getSalary());
		}
		
		
	}


