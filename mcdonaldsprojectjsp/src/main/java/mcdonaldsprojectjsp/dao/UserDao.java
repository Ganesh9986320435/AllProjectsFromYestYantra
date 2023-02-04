package mcdonaldsprojectjsp.dao;

import java.awt.Menu;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.omg.CORBA.PUBLIC_MEMBER;

import mcdonaldsprojectjsp.dto.Items;
import mcdonaldsprojectjsp.dto.User;

public class UserDao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public User saveUser(User user)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	public User checkByEmail(String email)
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from User p where p.email=?1");
		query.setParameter(1, email);
		User user=(User)query.getSingleResult();
		return user;
	}
	public mcdonaldsprojectjsp.dto.Menu saveMenu(mcdonaldsprojectjsp.dto.Menu menu)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}
	public List<mcdonaldsprojectjsp.dto.Menu> getMenu()
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from Menu p");
				List<mcdonaldsprojectjsp.dto.Menu> list=query.getResultList();
		return list;
	}
	public mcdonaldsprojectjsp.dto.Menu getSingleMenu(int id)
	{
		EntityManager entityManager=getEntityManager();
		mcdonaldsprojectjsp.dto.Menu items=entityManager.find(mcdonaldsprojectjsp.dto.Menu.class, id);
		return items;
	}
	public Items savItems(Items items)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(items);
		entityTransaction.commit();
		return items;

	}
}
