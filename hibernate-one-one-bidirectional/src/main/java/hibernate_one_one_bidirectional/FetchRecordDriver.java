package hibernate_one_one_bidirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchRecordDriver {
	public static void main(String[] args) {
		//program to fetch engine using car
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	Car car=em.find(Car.class,102);
	System.out.println(car.getCid());
	System.out.println(car.getName());
	System.out.println(car.getPrice());
	
	
	Engine engine=car.getEngine();
	System.out.println(engine.getEid());
	System.out.println(engine.getType());
	System.out.println(engine.getHp());
	}

}
