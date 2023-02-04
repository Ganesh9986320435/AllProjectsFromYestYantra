package serveletproject9.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.annotations.Check;

import serveletproject9.dto.*;

public class EmployeeDao {
	
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public void save(Employee employee)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		
		entityTransaction.commit();
	}
	public void update(Employee employee)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}
	public serveletproject9.dto.Check login(int id,String email)
	{
		EntityManager entityManager=getEntityManager();
		Employee person=entityManager.find(Employee.class, id); 
		serveletproject9.dto.Check check=new serveletproject9.dto.Check();
		check.setEmail(person.getEmail());
		check.setPasswordS(person.getPass());
		return check;
	}
}