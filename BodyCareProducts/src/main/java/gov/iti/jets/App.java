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
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String email = "hafsamoh@gmail.com";

        List<User> userList = entityManager.createQuery(
                "select e from User e where e.email = ?1")
                .setParameter(1, email)
                .getResultList();
        userList.forEach(System.out::println);

        entityManager.close();
        entityManagerFactory.close();
    }
}
