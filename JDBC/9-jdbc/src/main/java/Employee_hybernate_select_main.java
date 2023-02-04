import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Employee_hybernate_select_main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ganesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		System.out.println(entityManager.find(Employee_hybernate.class, 1));
	}
}
