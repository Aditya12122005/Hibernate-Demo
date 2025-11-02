package com.Aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setAid(441);
        a1.setAname("Aditya");
        a1.setTech("Java");

//        hey hibernate save with a1 object

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.Aditya.Alien.class);

        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

    }
}