import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employee_hybernate_main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ganesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee_hybernate employee_hybernate=new Employee_hybernate();
		employee_hybernate.setId(122);
		employee_hybernate.setName("gani");
		employee_hybernate.setAddress("bang");
		employee_hybernate.setPhone(9986320435l);
		entityTransaction.begin();
		entityManager.persist(employee_hybernate);
		entityTransaction.commit();
	}
}
