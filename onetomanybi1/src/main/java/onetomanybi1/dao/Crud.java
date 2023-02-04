package onetomanybi1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybi1.dto.School;
import onetomanybi1.dto.Student;

public class Crud {
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		return entityManagerFactory.createEntityManager();
	}
	public void save(List<Student> list)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		for (Student student2 : list) {
			entityManager.persist(student2);

		}
		entityTransaction.commit();
	}
	public void update(int id,String name)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student=entityManager.find(Student.class, 1);
		student.setName(name);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
