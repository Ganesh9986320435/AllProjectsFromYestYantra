package onetomanybi1.controller;

import java.util.ArrayList;
import java.util.List;

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
		entityManager.find(Student.class, 1);
		entityManager.find(Student.class, 1);
		entityManager.find(Student.class, 1);
		entityManager.find(Student.class, 1);
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		entityManager1.find(Student.class, 1);
		
	}
}
