package onetomany_uni.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

public class CompanyCRUD {
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public void save(Company company)
	{
		EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			List<Employee> list=company.getList();
			entityTransaction.begin();
			for (Employee employee : list) {
				entityManager.persist(employee);
			}
			entityManager.persist(company);
			entityTransaction.commit();
	}
	public void update(int id)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company company =entityManager.find(Company.class, id);
		if(company!=null)
		{
		entityTransaction.begin();
		entityManager.merge(company);
		entityTransaction.commit();
		}
		else {
			System.out.println("company not found");
		}
	}
	public void delete(int id)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company company=entityManager.find(Company.class, id);
		entityTransaction.begin();
		entityManager.remove(company);
		entityTransaction.commit();
	}
	public void fetchId(int id)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company company=entityManager.find(Company.class, id);
		System.out.println(company);
	}
	public void fetch(int id)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		javax.persistence.Query query=entityManager.createQuery("select a from Company a");
		List<Company> list =query.getResultList();
		System.out.println(list);
	}
}
