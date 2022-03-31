package gov.iti.jets.persistence.util;

import jakarta.persistence.*;

public class EntityFactory {
    
    private static final EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("myapp");
    
    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
    
}
