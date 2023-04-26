package com.example.jujutsukaisen.hibernate;

import com.example.jujutsukaisen.model.*;
import com.example.jujutsukaisen.model.AnimeCharacters;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
      configuration.addAnnotatedClass(AnimeCharacters.class);
        configuration.addAnnotatedClass(Species.class);
        configuration.addAnnotatedClass(Episode.class);
        configuration.addAnnotatedClass(Occupation.class);
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    public static void close() {
        sessionFactory.close();
    }
}
