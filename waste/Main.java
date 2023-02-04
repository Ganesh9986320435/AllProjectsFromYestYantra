package one_to_one_uni_controller;
import java.util.Scanner;
import one_to_one_uni_dao.PancardCrud;
import one_to_one_uni_dao.PersonCrud1;
import one_to_one_uni_dto.Pancard;
import one_to_one_uni_dto.Person;
public class Main {
	public static void main(String[] args) {
		boolean exit = true;
		Scanner scanner = new Scanner(System.in);
		PersonCrud1 personCrud = new PersonCrud1();
		PancardCrud pancardCrud = new PancardCrud();
		while (exit) {
			System.out.println(
					"enter the choice \n 1.insert \n 2.update \n 3.delete \n 4.getinformation of person \n 5.insert into pan card \n 6.update into pan card \n 7.delete in pancard \n 8.getinfo from pancard \n 9.exit");
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
				Person person = new Person();
				System.out.println("enter panid");
				int pid = scanner.nextInt();
				Pancard aadharCard = new Pancard();
				aadharCard.setPid(pid);
				aadharCard.setName(name);
				aadharCard.setAddress(address);
				person.setId(id);
				person.setName(name);
				person.setAdress(address);
				person.setPhone(phone);
				person.setPancard(aadharCard);
				personCrud.Save(person);
				break;
			case 2:
				System.out.println("enter the id");
				int id1 = scanner.nextInt();
				System.out.println("enter the name to be updated");
				String name1 = scanner.next();
				personCrud.update(id1, name1);
				break;
			case 3:
				System.out.println("enter the id");
				int id2 = scanner.nextInt();
				personCrud.delete(id2);
				break;
			case 4:
				personCrud.details();
				break;
			case 6:
				System.out.println("enter the id");
				int id4 = scanner.nextInt();
				System.out.println("enter the name to be updated");
				String name4 = scanner.next();
				pancardCrud.update(id4, name4);
				break;
			case 7:
				System.out.println("enter the id");
				int id5 = scanner.nextInt();
				pancardCrud.delete(id5);
				break;
			case 8:
				pancardCrud.details();
				break;
			default:
				exit = false;
				System.out.println("thank u");
				break;
			}
		}
	}
}
