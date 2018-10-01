package com.ruchi.Demohib;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       // System.out.println( "Hello World!" );
    	
    	Hiber hb=new Hiber();
    	hb.setId(1);
    	hb.setName("Rah");
    	
    	
    	Configuration con= new Configuration().configure().addAnnotatedClass(Hiber.class);
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(hb);
    	tx.commit();
    }
}
