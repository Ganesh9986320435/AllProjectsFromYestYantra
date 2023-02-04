package serveletproject7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.From;

import org.hibernate.sql.Select;

import serveletproject7.dto.Person;

public class PersonDao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public void save(Person person)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void update(Person person)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}
	public String login(String email)
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("Select p From Person p where p.email=?1");
		query.setParameter(1, email);
		Person person=(Person) query.getSingleResult();
		return person.getPass();
	}
} 
