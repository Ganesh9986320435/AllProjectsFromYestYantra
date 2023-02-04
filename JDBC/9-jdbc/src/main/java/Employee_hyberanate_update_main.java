import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employee_hyberanate_update_main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ganesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee_hybernate employee_hybernate=entityManager.find(Employee_hybernate.class, 12);
		employee_hybernate.setPhone(9986320435l);
		entityTransaction.begin();
		entityManager.merge(employee_hybernate);
		entityTransaction.commit();
	}
}
