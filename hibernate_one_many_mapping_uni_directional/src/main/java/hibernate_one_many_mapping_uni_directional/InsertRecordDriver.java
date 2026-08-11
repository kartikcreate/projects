package hibernate_one_many_mapping_uni_directional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecordDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Create bank Object
		
		Bank bank = new Bank();
		bank.setBid(111);
		bank.setName("canara");
		bank.setIFSC("CNB001");
		
		//Create Account multiple objects
		Account a1 = new Account();
		a1.setAid(1);
		a1.setCname("Sumit");
		a1.setBalance(20000);
		
		Account a2 = new Account();
		a2.setAid(2);
		a2.setCname("Anhi");
		a2.setBalance(25000);
		
		Account a3 = new Account();
		a3.setAid(3);
		a3.setCname("Pavan");
		a3.setBalance(18000);
		
		//Build a connection and add all objects into list
		
		List<Account> listAcc = new ArrayList<Account>();
		listAcc.add(a1);
		listAcc.add(a2);
		listAcc.add(a3);
		
		//Set account with bank
		
		bank.setAccount(listAcc);
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();
	}
}
