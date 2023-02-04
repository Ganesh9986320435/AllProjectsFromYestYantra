package jspproject2.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jspproject2.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}

	public Employee save(Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

	public Employee login(String email) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select p from Employee p where p.email=?1");
		query.setParameter(1, email);
		return (Employee) query.getSingleResult();
	}

	public List<Employee> employeeList() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select p from Employee p");
		List<Employee> list = query.getResultList();
		return list;
	}
	public boolean delete(int id)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee= entityManager.find(Employee.class, id);
		if(employee!=null) {
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return true;
		}
		return false;
	}
	public Employee checkId(int id)
	{
		return getEntityManager().find(Employee.class, id);
	}
	public boolean Edit(Employee employee)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Employee employee2=entityManager.find(Employee.class, employee.getId());
		if(employee2!=null)
		{
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
		}
		return false;
	}
}
