import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JioCRUD {
	static int i=0;
	static int iteration;
	public void signIn(Jio jio)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
	public boolean logIn(int id,String email,String password)
	{
		i=id;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio =entityManager .find(Jio.class, id);
		if(jio.email.equals(email)&&jio.password.equals(password))
		{
			System.out.println("loged in");
			if(jio.fbpass.equals("null"))
				iteration=1;
			else
				iteration=0;
			return true;
		}
		return false;
	}
	public void updatePass(JioLoginpass jioLoginpass) throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		jio.fbpass=jioLoginpass.fbpass;
		jio.instapass=jioLoginpass.instapass;
		jio.whatspass=jioLoginpass.whatspass;
		jio.snappass=jioLoginpass.snappass;
		jio.twitterpass=jioLoginpass.twitterpass;
		entityTransaction.begin();
		entityManager.merge(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void getInfo() throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		System.out.println(jio);
	}
	public void fbUpdate(String fbpass) throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		jio.fbpass=fbpass;
		entityTransaction.begin();
		entityManager.merge(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void instaUpdate(String instapass) throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		jio.instapass=instapass;
		entityTransaction.begin();
		entityManager.merge(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void whatsUpdate(String whatspass) throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		jio.whatspass=whatspass;
		entityTransaction.begin();
		entityManager.merge(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void snapUpdate(String snappass) throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		jio.snappass=snappass;
		entityTransaction.begin();
		entityManager.merge(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void twitterUpdate(String twitterpass) throws Exception
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Jio jio= entityManager.find(Jio.class, i);
		jio.twitterpass=twitterpass;
		entityTransaction.begin();
		entityManager.merge(jio);
		entityTransaction.commit();
		System.out.println("done");
	}
}
