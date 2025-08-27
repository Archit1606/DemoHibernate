package com.telusko.DemoHibn;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Allen telusko =new Allen();
//use it when you want to insert in the database;
        AlienName an=new AlienName();
        an.setFname("NavinReddy");
        an.setMname("BapReddy");
        an.setEname("Thatipali");
        
        telusko.setAid(106);
        telusko.setAname(an);
        telusko.setColor("yellow");
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Allen.class);
        ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(telusko);
        
        
        //get used to fetch the data
//        telusko=(Allen)session.get(Allen.class,105);
        tx.commit();
//        System.out.println(telusko);
          
    }
}
