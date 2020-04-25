package com.capg.jpaapps.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.capg.jpaapps.entities.Author;


	public class Test
	{

		public static void main(String[] args)
		{
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaApp1");  
		        EntityManager em = emf.createEntityManager();  
		          
		       em.getTransaction().begin();  
		          
		        Author a1 = new Author();  
		        a1.setAuthorId(1111);  
		        a1.setFirstName("Yash");  
		        a1.setMiddleName("Narain"); 
		        a1.setLastName("Bajpai");
		        a1.setPhoneNo("9686899485");
		        
		        Author a2 = new Author();  
		        a2.setAuthorId(1010);  
		        a2.setFirstName("Satish");  
		        a2.setMiddleName("Shekhar"); 
		        a2.setLastName("Mishra");
		        a2.setPhoneNo("834568392");
		        
		        em.persist(a1);
		        em.persist(a2);
		       
		        em.getTransaction().commit();         
		        
		}
	}


