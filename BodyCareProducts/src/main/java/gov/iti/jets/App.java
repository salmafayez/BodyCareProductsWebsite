package gov.iti.jets;

import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myapp");

    }
}
