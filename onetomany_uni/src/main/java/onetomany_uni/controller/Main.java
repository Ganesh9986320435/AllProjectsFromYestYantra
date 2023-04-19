package onetomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.omg.CORBA.PUBLIC_MEMBER;

import onetomany_uni.dto.Product;
import onetomany_uni.dto.Review;

public class Main {
	public static void main(String[] args) {
//		Review review = new Review();
//		review.setRating(3);
//		Review review1 = new Review();
//		review1.setRating(4);
//		Review review2 = new Review();
//		review2.setRating(3);
//		Review review3 = new Review();
//		review3.setRating(4);
//		List<Review> list = new ArrayList<Review>();
//		list.add(review);
//		list.add(review1);
//		list.add(review2);
//		list.add(review3);
//		Product product = new Product();
//		product.setName("iphone");
//		product.setList(list);
//		int rating = 0;
//		for (Review r : list) {
//			rating += r.getRating();
//		}
//		rating = rating / list.size();
//		product.settRating(rating);
		int id=5;		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Review review=entityManager.find(Review.class, id);
		Query query=entityManager.createQuery("select p from Product p");
		List<Product> list=query.getResultList();
		for(Product p1:list)
		{
			for(Review r:p1.getList())
			{
				if(r.getId()==id)
				{
					System.out.println(p1.getId());
					System.out.println(p1.getName());
					System.out.println(p1.gettRating());
				}
			}
		}
//		int id=5;
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		Review review=entityManager.find(Review.class, id);
//		Query query=entityManager.createQuery("select p from Product p where p.list.id=?1");
//		entityManager.setProperty("list_id", id);
//		Product product=(Product) query.getSingleResult();
//		System.out.println(product.getName());
		
		
		
		
		
		
		
		
	
	}
}
