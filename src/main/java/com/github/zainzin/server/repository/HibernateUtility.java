package com.github.zainzin.server.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtility {
    private static SessionFactory sessionFactory;

    private HibernateUtility() {
    }

    static synchronized SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure()
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
