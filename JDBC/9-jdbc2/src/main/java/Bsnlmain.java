import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Bsnlmain {
	public static void main(String[] args) {
		boolean exit=true;
		Scanner scanner=new Scanner(System.in);
		BsnlCRUD bsnlCRUD=new BsnlCRUD();
		while(exit) {
			System.out.println("enter the choice  \n 1.insert \n 2.update \n 3.delete \n 4.fetch");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the data");
				Bsnl1 bsnl=new Bsnl1();
				System.out.println("enter the id");
				bsnl.setId(scanner.nextInt());
				System.out.println("enter name");
				bsnl.setName(scanner.next());
				System.out.println("enter fathername");
				bsnl.setFnameString(scanner.next());
				System.out.println("enter mothername");
				bsnl.setMname(scanner.next());
				System.out.println("enter address");
				bsnl.setAdress(scanner.next());
				System.out.println("enter totalmarks");
				bsnl.setMarks(scanner.nextInt());
				System.out.println("enter the percentage");
				bsnl.setPercentage(scanner.nextInt());
				bsnlCRUD.save(bsnl);
				break;
			case 2:
				System.out.println("enter the id");
				int id=scanner.nextInt();
				System.out.println("enter the new name");
				String name=scanner.next();
				bsnlCRUD.update(id, name);
				break;
			case 3:
				System.out.println("enter id to be deleted");
				int id1=scanner.nextInt();
				bsnlCRUD.delete(id1);
				break;
			case 4:
				System.out.println("enter the id to fetch data");
				int id2=scanner.nextInt();
				bsnlCRUD.fetch(id2);
				break;
			default:
				exit=false;
				break;
			}
		}
	}
}
