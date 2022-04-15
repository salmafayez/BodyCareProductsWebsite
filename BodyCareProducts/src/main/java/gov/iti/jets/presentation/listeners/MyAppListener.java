package gov.iti.jets.presentation.listeners;

import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyAppListener implements ServletContextListener{

    EntityManagerFactory entityManagerFactory;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        entityManagerFactory.close();
    }
    
}
