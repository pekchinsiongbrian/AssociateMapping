package com.dxc.AssociationMappingManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxc.entity.Address;
import com.dxc.entity.Employee;

public class App {
	private static SessionFactory factory;
    public static void main(String[] args) {
    	try {
        	// create factory object
        	factory = new Configuration().configure("/resource/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable e) {
        	System.err.println("Failed to create session instance.");
        	throw new ExceptionInInitializerError(e);
        }
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	Employee e1=new Employee();    
        e1.setName("Ravi Malik");    
        e1.setEmail("ravi@gmail.com");    
          
        Employee e2=new Employee();  
        e2.setName("Anuj Verma");  
        e2.setEmail("anuj@gmail.com");  
            
        Address address1=new Address();    
        address1.setAddressLine1("G-13,Sector 3");    
        address1.setCity("Noida");    
        address1.setState("UP");    
        address1.setCountry("India");    
        address1.setPincode(201301);    
            
        e1.setAddress(address1);    
        e2.setAddress(address1);  
      
        session.persist(e1);    
        session.persist(e2);  
        tx.commit();    
            
        session.close();    
        System.out.println("success");    
    }
}
