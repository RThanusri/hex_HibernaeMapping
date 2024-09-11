package com.hex.com.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 
    			UserDetails user = new UserDetails();
    	 
    			VehicleDetails vehicle = new VehicleDetails(); 
    			VehicleDetails vehicle2 = new VehicleDetails(); 
    	 
    			vehicle.setVehicleName("BMW Car");
    			vehicle2.setVehicleName("AUDI Car");
    	 
    			user.setUserName("Dinesh Rajput"); 
    			user.getVehicle().add(vehicle);
    			user.getVehicle().add(vehicle2);
    			SessionFactory sessionFactory = new Configuration().configure("hiberConfig.xml").buildSessionFactory(); //create session factory object
    			Session session = sessionFactory.openSession(); 
    			session.beginTransaction(); 
    	 
    			session.save(vehicle); 
    			session.save(vehicle2);
    			session.save(user); 
    	 
    			session.getTransaction().commit(); 
    			session.close(); 
    	 
    		}
    	 
}
