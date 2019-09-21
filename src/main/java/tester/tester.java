/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Customer;

/**
 *
 * @author Klan
 */
public class tester {
    
    public static void main(String[] args) {
        
        
	Customer cust = new Customer("Michael", "Klan");
	cust.addHobby("hobby1");
	cust.addHobby("hobby2");
	cust.addHobby("dovenskab");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        
        EntityManager em = emf.createEntityManager();
        
	try {
		em.getTransaction().begin();	
		em.persist(cust);	
		em.getTransaction().commit();
                }finally{
		em.close();
                }
    }
}
