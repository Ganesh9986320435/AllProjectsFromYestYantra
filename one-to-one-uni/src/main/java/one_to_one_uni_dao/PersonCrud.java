package one_to_one_uni_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.From;
import org.hibernate.sql.Select;
import one_to_one_uni_dto.AadharCard;
import one_to_one_uni_dto.Person;

public class PersonCrud {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public void Save(Person person)
	{
		EntityTransaction entityTransaction=getEntityManager().getTransaction(); 
		entityTransaction.begin();
		getEntityManager().persist(person);
		getEntityManager().persist(person.getAadharCard());
		entityTransaction.commit();
		System.out.println("succsessfully added");
	}
	public void update(int id,String name)
	{
		EntityTransaction entityTransaction=getEntityManager().getTransaction();
		Person person=getEntityManager().find(Person.class, id);
		person.setName(name);
		entityTransaction.begin();
		getEntityManager().merge(person);
		entityTransaction.commit();
		System.out.println("successfuly updated");
	}
	public void delete(int id)
	{
		EntityTransaction entityTransaction=getEntityManager().getTransaction();
		AadharCard person=getEntityManager().find(AadharCard.class, id);
		if(person!=null)
		{
		entityTransaction.begin();
		getEntityManager().remove(person);
		entityTransaction.commit();
		System.out.println("successfully deleted");
		}
	}
	public List<Person> details()
	{
		EntityTransaction entityTransaction=getEntityManager().getTransaction();
		return getEntityManager().createQuery("Select a From Person a").getResultList();
	}
}
