package com.test.JPALibraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args, Object id )
    {
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
    	EntityManager em=emf.createEntityManager();
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int sid;
    	
    	
    	
    	
    	do {
    		 
    		 
    		 System.out.println("1. Insert Data");
    		 System.out.println("2. Show Data");
    		 System.out.println("3. Update Data");
    		 System.out.println("4. delete Data.");
    		 System.out.println("5. Exit");
    		 System.out.println("6. Enter Your Choice");
    		
    		 int choice= sc.nextInt();
    		 
    		 switch (choice) {
			case 1:{
				
				em.getTransaction().begin();
				Students obj= new Students(1,"akash","pune","jspm");
		    	em.persist(obj);
		    	
		    	List<Students> list= new ArrayList<>();
		    	
		    	Library li= new Library(12,"unique","pune",30);
		    	em.persist(li);
		    	
		    	em.getTransaction().commit();
				break;
				
    		 }

    		 case 2:{
    			 em.getTransaction().begin();
     			
     			System.out.println("Enter the Id: ");
     			int id1=sc.nextInt();
     			
     			Students obj=em.find(Students.class, id1);
     			

     			System.out.println("Enter the sName: ");
     			String sname=sc.next();
     			
     			System.out.println("Enter the saddress: ");
     			String saddress=sc.next();
     			
     			
     			
     			obj.setSname(sname);
     			obj.setSaddress(saddress);
     			
     			em.persist(obj);
     			
     			em.getTransaction().commit();
     			break;
    			 
    		 }
    		 
    		 case 3:{
    			 
    			 System.out.println("Enter the Id: ");
     			int sid1=sc.nextInt();
     			Students obj= em.find(Students.class, id);
     			System.out.println(obj);
     			
    		 
        			
    		 break;
    	 }
    		 
    		 case 4:{
    			 em.getTransaction().begin();
     			
     			System.out.println("Enter the Id: ");
     			int id1=sc.nextInt();
     			
     			Students obj=em.find(Students.class, id1);
     			em.remove(obj);
     			em.getTransaction().commit();
     			break;
    		 }
    		 
    		 case 5:{
    			 System.out.println("Exit");
    		 }
    		 }
    	}
    	while(true);
    	
    }}
    	

    
    	