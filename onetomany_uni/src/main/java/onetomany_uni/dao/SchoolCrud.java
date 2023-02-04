package onetomany_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_uni.dto.School;
import onetomany_uni.dto.Student;

public class SchoolCrud {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void save(School school) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		List<Student> list = school.getList();
		entityTransaction.begin();
		for (Student student : list) {
			entityManager.persist(student);
		}
		entityManager.persist(school);
		entityTransaction.commit();
	}

	public void update(int id, School school) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		School school2 = entityManager.find(School.class, id);
		if (school2 != null) {
			school.setId(id);
			school.setList(school.getList());
			entityTransaction.begin();
			entityManager.merge(school);
			entityTransaction.commit();
		} else {
			System.out.println("company not found");
		}
	}

	public void delete(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		School school = entityManager.find(School.class, id);
		entityTransaction.begin();
		entityManager.remove(school);
		entityTransaction.commit();
	}

	public void fetchId(int id) {
		EntityManager entityManager = getEntityManager();
		School company = entityManager.find(School.class, id);
		System.out.println(company);
	}

	public void fetch(int id) {
		EntityManager entityManager = getEntityManager();
		javax.persistence.Query query = entityManager.createQuery("select a from School a");
		List<School> list = query.getResultList();
		System.out.println(list);
	}

}
