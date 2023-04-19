package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import antlr.collections.List;
import dto.Employee;

@Component
public class Employeedao {
	@Autowired
	EntityManager entityManager;
	public void save(Employee employee)
	{
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
	}
	public void update(Employee employee)
	{
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(employee);
		transaction.commit();
	}public void remove(int id)
	{
		EntityTransaction transaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, id);
		transaction.begin();
		entityManager.remove(employee);
		transaction.commit();
	}public Employee fetchbyid(int id)
	{
		return entityManager.find(Employee.class, id);
	}
}
