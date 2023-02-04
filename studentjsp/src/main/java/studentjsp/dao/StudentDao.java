package studentjsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import studentjsp.dto.Student;

public class StudentDao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public Student save(Student student)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	public Student login(String email)
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from Student p where p.email=?1");
		query.setParameter(1, email);
		return (Student)query.getSingleResult();
	
	}
	public List<Student> getList()
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from Student p");
		return query.getResultList();
	}
	public boolean delete(String email)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Query query=entityManager.createQuery("select p from Student p where p.email=?1");
		query.setParameter(1, email);
		Student student=(Student)query.getSingleResult();
		if(student!=null)
		{
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public Student getInfo(String email)
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from Student p where p.email=?1");
		query.setParameter(1, email);
		Student student=(Student)query.getSingleResult();
		return student;
	}
	public boolean Edit(Student student)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Query query=entityManager.createQuery("select p from Student p where p.email=?1");
		query.setParameter(1, student.getEmail());
		Student employee2=(Student)query.getSingleResult();
		if(employee2!=null)
		{
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return true;
		}
		return false;
	}
}
