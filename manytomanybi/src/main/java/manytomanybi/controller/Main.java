package manytomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybi.dto.Course;
import manytomanybi.dto.Student;

public class Main {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(1);
		student1.setName("gani");
		Student student2=new Student();
		student2.setId(2);
		student2.setName("mani");
		Student student3=new Student();
		student3.setId(3);
		student3.setName("pani");
		Course course1=new Course();
		course1.setId(101);
		course1.setName("java");
		Course course2=new Course();
		course2.setId(102);
		course2.setName("sql");
		List<Student> list1=new ArrayList<Student>();
		list1.add(student1);
		list1.add(student2);
		list1.add(student3);
		List<Student> list2=new ArrayList<Student>();
		list2.add(student3);
		List<Course> list3=new ArrayList<Course>();
		list3.add(course1);
		List<Course> list4=new ArrayList<Course>();
		list4.add(course1);
		list3.add(course2);
		student1.setList(list3);
		student2.setList(list4);
		student3.setList(list4);
		course1.setList(list1);
		course2.setList(list2);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityTransaction.commit();
	}
}
