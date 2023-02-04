package one_to_one_uni_dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import one_to_one_uni_dto.Pancard;
public class PancardCrud {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public void Save(Pancard pancard) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityTransaction.commit();
		System.out.println("succsessfully added");
	}
	public void update(int id, String name) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pancard person = entityManager.find(Pancard.class, id);
		person.setName(name);
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		System.out.println("successfuly updated");
	}
	public void delete(int id) {
		PersonCrud1 personCrud1 = new PersonCrud1();
		personCrud1.delete(id);
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pancard person = entityManager.find(Pancard.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			System.out.println("successfully deleted");
		}
	}
	public void details() {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Query query = entityManager.createQuery("select a from Pancard a");
		List<Pancard> list = query.getResultList();
		System.out.println(list);
	}
}
