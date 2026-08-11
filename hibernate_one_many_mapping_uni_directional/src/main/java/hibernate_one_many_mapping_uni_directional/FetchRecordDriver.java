package hibernate_one_many_mapping_uni_directional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchRecordDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-config");
		EntityManager em = emf.createEntityManager();
		
		Bank bank= em.find(Bank.class, 111);
		
		System.out.println("Bank Details...");
		System.out.println(bank.getBid());
		System.out.println(bank.getName());
		System.out.println(bank.getIFSC());
		
		List<Account> account = bank.getAccount();
		System.out.println("Account Details");
		for(Account account1: account) {
			System.out.println(account1.getAid());
			System.out.println(account1.getCname());
			System.out.println(account1.getBalance());
			System.out.println("------------------");
		}
	}
}
