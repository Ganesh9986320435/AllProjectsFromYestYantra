import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Third {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityManager entityManager1=entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction=entityManager.getTransaction();
	Student student=new Student();
	student.setName("llll");
	List<Student> list=new ArrayList();
	list.add(student);
	User user=new User();
	user.setName("gani");
	user.setList(list);
	entityTransaction.begin();
	entityManager.find(User.class, 2);
	entityManager1.find(User.class, 2);
	entityTransaction.commit();
	}
}
