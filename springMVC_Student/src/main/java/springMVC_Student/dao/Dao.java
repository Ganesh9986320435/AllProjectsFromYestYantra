package springMVC_Student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springMVC_Student.dto.Student;
@Repository
public class Dao {
	
	@Autowired
	private EntityManager entityManager;
	
	public Student save(Student student)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	public List<Student> getAllStudents()
	{
		Query query=entityManager.createQuery("select p from Student p");
		return query.getResultList();
	}

	public boolean delete(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student=entityManager.find(Student.class, id);
		if(student!=null) {
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;}
		else {
		return false;
	}
	
	}

	public Student getbyid(int id) {
		return entityManager.find(Student.class, id);
	}

	public Student update(Student student) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}}
