package hibernate_one_one_bidirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchCarByusingEngine {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	 Engine engine=em.find(Engine.class,2);
	 System.out.println(engine.getEid());
		System.out.println(engine.getType());
		System.out.println(engine.getHp());
		
		
		Car car=engine.getCar();
	System.out.println(car.getCid());
	System.out.println(car.getName());
	System.out.println(car.getPrice());
	
	
}
}
