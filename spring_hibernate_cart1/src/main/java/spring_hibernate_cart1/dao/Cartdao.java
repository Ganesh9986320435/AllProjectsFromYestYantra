package spring_hibernate_cart1.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_hibernate_cart1.dto.Cart;
import spring_hibernate_cart1.dto.Items;

@Component
public class Cartdao {
	@Autowired
	EntityManager entityManager;
	
	public void saveCart(Cart cart) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(cart);
		entityTransaction.commit();
	}
	
	public void updateCart(int id,String name) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Cart cart = entityManager.find(Cart.class, id);
		cart.setEmail(name);
		entityTransaction.begin();
		entityManager.merge(cart);
		entityTransaction.commit();
	}
	public void updateCartaddnewItems(int id,List<Items> list) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Cart cart = entityManager.find(Cart.class, id);
		cart.setList(list);
		entityTransaction.begin();
		entityManager.merge(cart);
		entityTransaction.commit();
	}
	
	public void deleteCart(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Cart cart = entityManager.find(Cart.class, id);
		entityTransaction.begin();
		entityManager.remove(cart);
		entityTransaction.commit();
	}
	
	public void getCartByid(int id) {
		Cart cart = entityManager.find(Cart.class, id);
		System.out.println(cart);
	}
	public void displayAllCart() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Query query = entityManager.createQuery("Select cart from Cart cart");
		List<Cart> list = query.getResultList();
		System.out.println(list);
	}
}
