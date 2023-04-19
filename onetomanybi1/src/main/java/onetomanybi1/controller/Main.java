package onetomanybi1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybi1.dao.Crud;
import onetomanybi1.dto.School;
import onetomanybi1.dto.Student;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student=new Student();
		student.setId(1);
		student.setName("gani");
		Student student2=new Student();
		student2.setId(2);
		student2.setName("mani");
		School school=new School();
		school.setId(1);
		school.setName("lapa");
		student.setSchool(school);
		student2.setSchool(school);
		List<Student> list=new ArrayList<Student>();
		list.add(student2);
		list.add(student);
		Crud crud=new Crud();
		crud.save(list);
	}
}
