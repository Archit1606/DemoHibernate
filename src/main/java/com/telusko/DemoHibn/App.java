package com.telusko.DemoHibn;
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
    public static void main( String[] args )
    {
        Allen telusko =new Allen();
        telusko.setAid(102);
        telusko.setAname("navin");
        telusko.setColor("green");
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Allen.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(telusko);
        tx.commit();
          
    }
}
