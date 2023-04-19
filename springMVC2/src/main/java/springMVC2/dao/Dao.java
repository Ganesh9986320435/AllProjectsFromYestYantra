package springMVC2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springMVC2.dto.Employee;

@Repository
public class Dao {
	
	
	@Autowired
	private EntityManager entityManager;
	
	public Employee save(Employee employee)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

	public List<Employee> getall() {
		Query query=entityManager.createQuery("select p from Employee p");
		return query.getResultList();
	}

	public Employee getbyid(int id) {
		return entityManager.find(Employee.class, id);
	}

	public Employee update(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return employee;
	}

	public boolean delete(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null) {
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return true;}
		else {
			return false;
		}
	}
}
