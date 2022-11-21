package com.bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo implements AccountDao{
	
	
	@Override
	public Account findById(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, id);
		
		if(account != null) {
			return account;
		}else {
			System.out.println("Account Not Found !");
			return null;
		}
		
	
	}

	@Override
	public String save(Account account) {
		String msg = "Record Not Saved";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(account);
		et.commit();
		
		em.close();
		
		msg = "Record Saved...";
		return msg;
	}

	

	@Override
	public String deleteAccountById(int id) {
		String msg = "Record Not found";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Account account = em.find(Account.class, id);
		
		if(account != null) {
			et.begin();
			em.remove(account);
			et.commit();
			
			msg = id+" Record Deleted";
		}
		
		
		return msg;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}
}





