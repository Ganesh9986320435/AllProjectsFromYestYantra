package one_to_one_uni_dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import one_to_one_uni_dto.Pancard;
import one_to_one_uni_dto.Person;
public class PersonCrud1 {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public void Save(Person person) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pancard pancard = person.getPancard();
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityManager.persist(person);
		entityTransaction.commit();
		System.out.println("succsessfully added");
	}
	public void update(int id, String name) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = getEntityManager().find(Person.class, id);
		person.setName(name);
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		System.out.println("successfuly updated");
	}
	public void delete(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			System.out.println("successfully deleted");
		}
	}
	public void details() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select r from Person r");
		List<Person> list = query.getResultList();
		System.out.println(list);
	}
}
