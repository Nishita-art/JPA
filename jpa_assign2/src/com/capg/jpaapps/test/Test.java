package com.capg.jpaapps.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpaapps.entities.Author;
import com.capg.jpaapps.entities.Book;

public class Test
{
	public static void main(String[] args)
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaApp2");
		EntityManager em = emf.createEntityManager();
		
		Author auth=new Author(1010, "Preeti Shenoy");
		Author auth1=new Author(1011,"Dan Brown");
		Book b=new Book(1001,"Chetan",789,"S",1500);
		
		em.getTransaction().begin();
		em.persist(auth);
		em.persist(auth1);
		em.persist(b);
		em.getTransaction().commit();
		System.out.println("Data Saved");
		emf.close();
		
	}

}
