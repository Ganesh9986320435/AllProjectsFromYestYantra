package hospitalproject1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospitalproject1.dto.*;


public class BranchDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveBranch(int hid, Branch branch) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class, hid);

		branch.setHospital(hospital);

		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();
	}

	public void updateBranch(int id, Branch branch) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch receivedBranch = entityManager.find(Branch.class, id);
		if (receivedBranch != null) {
			branch.setBid(id);

			entityTransaction.begin();
			entityManager.merge(branch);
			entityTransaction.commit();
		} else {
			System.out.println("Branch doesn't exists");
		}
	}

	public void deleteBranch(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class, id);

		entityTransaction.begin();
		entityManager.remove(branch);
		entityTransaction.commit();
	}

	public void getBranchById(int id) {
		EntityManager entityManager = getEntityManager();
		Branch branch = entityManager.find(Branch.class, id);
		System.out.println(branch);
	}

	public void getAllBranch() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT b FROM Branch b");
		List<Branch> branchs = query.getResultList();
		System.out.println(branchs);
	}

}
