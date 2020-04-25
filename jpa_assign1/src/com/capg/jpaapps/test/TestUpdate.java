package com.capg.jpaapps.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.capg.jpaapps.entities.Author;

public class TestUpdate 
{
   
	public static void main(String[] args)
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaApp1");  
	        EntityManager em = emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	       
	        Author a = em.find(Author.class,1110);  
	        System.out.println("Before Updation");  
	        System.out.println("Author id = "+a.getAuthorId());  
	        System.out.println("Author First Name = "+a.getFirstName());  
	        System.out.println("Author Middle Name  = "+a.getMiddleName());
	        System.out.println("Author Last Name  = "+a.getLastName());
	        System.out.println("Author Phone Number  = "+a.getPhoneNo());
	        
	          
	        a.setFirstName("Rakesh");
	        a.setPhoneNo("9047685672");
	          
	        System.out.println("After Updation");
	        System.out.println("Author id = "+a.getAuthorId());  
	        System.out.println("Author First Name = "+a.getFirstName());  
	        System.out.println("Author Middle Name  = "+a.getMiddleName());
	        System.out.println("Author Last Name  = "+a.getLastName());
	        System.out.println("Author Phone Number  = "+a.getPhoneNo());        
	}
}


