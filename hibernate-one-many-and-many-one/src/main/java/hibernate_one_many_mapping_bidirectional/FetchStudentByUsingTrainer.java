package hibernate_one_many_mapping_bidirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchStudentByUsingTrainer {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	Trainer trainer=em.find(Trainer.class,104);
	System.out.println(trainer.getTid());
	System.out.println(trainer.getName());
	System.out.println(trainer.getSalary());
	List<Student> std=trainer.getStudents();
	
	for(Student student:std) {
		System.out.println(student.getSid());
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
	
	
}
}
