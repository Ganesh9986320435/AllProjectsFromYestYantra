import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BsnlCRUD {
//	public EntityManager getEntityManager()
//	{
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		return entityManager;
//	}
	public void save(Bsnl1 bsnl)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bsnl);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void update(int id,String name)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Bsnl1 bsnl= entityManager.find(Bsnl1.class, id);
		bsnl.setName(name);
		entityTransaction.begin();
		entityManager.merge(bsnl);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void delete(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Bsnl1 bsnl= entityManager.find(Bsnl1.class, id);
		entityTransaction.begin();
		entityManager.remove(bsnl);
		entityTransaction.commit();
		System.out.println("done");
	}
	public void fetch(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	 Query query= entityManager.createQuery(null)
		query.getResultList()
		System.out.println(bsnl);
		System.out.println("done");
	}	
}
