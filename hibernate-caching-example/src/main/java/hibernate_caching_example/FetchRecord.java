package hibernate_caching_example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchRecord {
	public static void main(String[] args) {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
	EntityManager em = emf.createEntityManager();
	OrderService os=em.find(OrderService.class,123466);
	System.out.println(os.getOid());
	System.out.println(os.getPname());
	System.out.println(os.getQuantity());
	// second time
	OrderService os1=em.find(OrderService.class,123466);
	System.out.println(os1.getOid());
	System.out.println(os1.getPname());
	System.out.println(os1.getQuantity());
	}
}
