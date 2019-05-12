import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpaExample {
    public static void main(String[] args) {
      EntityManagerFactory exampl = Persistence.createEntityManagerFactory("exampl");
     EntityManager entityManager = exampl.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(new Book("Java2"));
        transaction.commit();

        entityManager.close();
        exampl.close();

    }
}
