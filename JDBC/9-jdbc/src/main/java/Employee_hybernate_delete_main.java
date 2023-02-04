import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employee_hybernate_delete_main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ganesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityManager.find(Employee_hybernate.class, 1);
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Employee_hybernate.class, 1));
		entityTransaction.commit();
	}
}
