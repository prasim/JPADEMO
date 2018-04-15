package com.prasim.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a = new Alien();
    	a.setAid(4);
    	a.setAname("abc");
    	a.setTech("dfd");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
        Alien b = em.find(Alien.class, 3);
        System.out.println(b);
    }
}
