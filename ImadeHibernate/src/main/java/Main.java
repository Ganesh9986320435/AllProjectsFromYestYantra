import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) throws IOException {
		ImageTest imageTest=new ImageTest();
		imageTest.setId(4);
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Hp\\Downloads/marvel-desktop-black-panther-2022-vp36bu0tk0c4uzqr.jpg");
		byte[] data=new byte[fileInputStream.available()];
		fileInputStream.read(data);
		imageTest.setImage(data);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(imageTest);
		entityTransaction.commit();
		
	}
}
