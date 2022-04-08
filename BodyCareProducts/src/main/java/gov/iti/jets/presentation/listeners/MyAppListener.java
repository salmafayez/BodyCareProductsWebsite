package gov.iti.jets.presentation.listeners;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
