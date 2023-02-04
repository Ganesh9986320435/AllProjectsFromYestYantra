package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.annotations.Check;

import dto.Student;


public class StudentDao {
	public EntityManager getEntityManager() {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
	return entityManagerFactory.createEntityManager();
	}
	public void save(Student student)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		
		entityTransaction.commit();
	}
	public void update(Student student)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
	public dto.Check login(int id,String email)
	{
		EntityManager entityManager=getEntityManager();
		Student student=entityManager.find(Student.class, id); 
		dto.Check check=new dto.Check();
		check.setEmail(student.getEmail());
		check.setPasswordS(student.getPassword());
		check.setSname(student.getSchoolname());
		return check;
	}
}
