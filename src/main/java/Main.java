import Test.Banks;
import Test.Client;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nata on 31.01.2017.
 */
public class Main {


    public static void main(String[] args) {


        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.jpa");
        EntityManager em = sessionFactory.createEntityManager();

        em.getTransaction().begin();

        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client();

        c1.setName("Igor");
        c2.setName("Igor2");
        c3.setName("Igor3");


        c1.setSurname("Pety");
        c2.setSurname("Pety2");
        c3.setSurname("Pety3");

        em.persist(c1);
        em.persist(c2);
        em.persist(c3);

        em.getTransaction().commit();

        em.getTransaction().begin();


        Banks b1 = new Banks();

        b1.setName("Hresatyk");
        Banks b2 = new Banks();

        b2.setName("Hresatyk2");


        List<Client> clientList = new ArrayList<Client>();
        clientList.add(c1);
        clientList.add(c2);
        b1.setClientList(clientList);


        em.persist(b1);

        List<Client> clientList2 = new ArrayList<Client>();
        clientList2.add(c3);
        clientList2.add(c1);

        b2.setClientList(clientList2);

        em.persist(b1);
        em.persist(b2);
        em.getTransaction().commit();


        em.close();
        sessionFactory.close();

    }
}
