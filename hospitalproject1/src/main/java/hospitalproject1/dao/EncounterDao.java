package hospitalproject1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospitalproject1.dto.*;
public class EncounterDao {
	static Branch branch=null;
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveEncounter(int pid, int bid, Encounter encounter) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, pid);
		encounter.setPerson(person);
		branch = entityManager.find(Branch.class, bid);
		
		List<Branch> branchs = encounter.getBranchs();
		if(branchs!=null)
		{
		branchs.add(branch);
		encounter.setBranchs(branchs);
		entityManager.remove(branch);
		}
		else
		{
		List< Branch>branchs2=new ArrayList<Branch>();
		branchs2.add(branch);
		encounter.setBranchs(branchs2);
		}
		entityTransaction.begin();
		entityManager.merge(branch);
		entityManager.merge(encounter);
		entityTransaction.commit();
	}

	public void updateEncounter(int id, Encounter encounter) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter receivedEncounter = entityManager.find(Encounter.class, id);
		if (receivedEncounter != null) {
			encounter.setEid(id);

			entityTransaction.begin();
			entityManager.merge(encounter);
			entityTransaction.commit();
		} else {
			System.out.println("Encounter doesn't exists");
		}
	}

	public void deleteEncounter(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter encounter = entityManager.find(Encounter.class, id);

		entityTransaction.begin();
		entityManager.remove(encounter);
		entityTransaction.commit();
	}

	public void getEncounterById(int id) {
		EntityManager entityManager = getEntityManager();
		Encounter encounter = entityManager.find(Encounter.class, id);
		System.out.println(encounter);
	}

	public void getAllEncounter() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT e FROM Encounter e");
		List<Encounter> encounters = query.getResultList();
		System.out.println(encounters);
	}

}
