package one_to_one_uni_controller;

import java.util.Scanner;

import one_to_one_uni_dao.PersonCrud;
import one_to_one_uni_dto.AadharCard;
import one_to_one_uni_dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		boolean exit = true;
		Scanner scanner = new Scanner(System.in);
		PersonCrud personCrud = new PersonCrud();
		while (true) {
			System.out.println("enter the choice \n 1.insert \n 2.update \n 3.delete \n 4.getinformation \n 5.exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter id");
				int id = scanner.nextInt();
				System.out.println("enter the name");
				String name = scanner.next();
				System.out.println("enter address");
				String address = scanner.next();
				System.out.println("enter phonenumber");
				long phone = scanner.nextLong();
				System.out.println("enter aadharid");
				int aid = scanner.nextInt();
				Person person = new Person();
				AadharCard aadharCard = new AadharCard();
				aadharCard.setAid(aid);
				aadharCard.setName(name);
				aadharCard.setAddress(address);
				person.setId(id);
				person.setName(name);
				person.setAdress(address);
				person.setPhone(phone);
				person.setAadharCard(aadharCard);
				personCrud.Save(person);
				break;
			case 2:
				System.out.println("enter the id");
				int id1=scanner.nextInt();
				System.out.println("enter the name to be updated");
				String name1=scanner.next();
				personCrud.update(id1,name1);
				break;
			case 3:
				System.out.println("enter the id");
				int id2=scanner.nextInt();
				personCrud.delete(id2);
				break;
			case 4:
				System.out.println("enter the id");
				int id3=scanner.nextInt();
				System.out.println(personCrud.details());
				break;
			default:
				exit=false;
				break;
			}
		}
	}
}
