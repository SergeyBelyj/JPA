
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("exampl");
            EntityManager em = emf.createEntityManager();

            Book book = new Book("Java");

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();

        em.close();
        emf.close();
    }
}
