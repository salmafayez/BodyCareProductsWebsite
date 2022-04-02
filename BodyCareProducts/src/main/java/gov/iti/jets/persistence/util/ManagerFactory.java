package gov.iti.jets.persistence.util;

import jakarta.persistence.*;

public class ManagerFactory {
    
    private static final EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("myapp");
    
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    } 
}
