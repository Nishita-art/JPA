package com.capg.jpaapps.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpaapps.entities.Author;

public class TestDelete
{
      public static void main(String args[])
      {
    	  
    	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaApp1");  
    	    EntityManager em = emf.createEntityManager();  
    	    em.getTransaction().begin();  
    	  
    	    Author b = em.find(Author.class,1010);  
    	    em.remove(b);  
    	    em.getTransaction().commit(); 
      }
}
