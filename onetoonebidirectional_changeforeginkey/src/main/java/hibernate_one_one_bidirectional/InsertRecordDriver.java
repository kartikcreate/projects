package hibernate_one_one_bidirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecordDriver {
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
			Engine engine = new Engine();
			engine.setEid(2);
			engine.setType("diesel");
			engine.setHp("1000hp");

			Car car = new Car();
			car.setCid(102);
			car.setName("creta");
			car.setPrice(60000);

			// 2.Connects the  Engine Object with car
			car.setEngine(engine);// p.k of engine --> inside car f.k
			
			engine.setCar(car);

			// 3.Save the object
			et.begin();
			em.persist(car);
			em.persist(engine);
			et.commit();

		}

	}

