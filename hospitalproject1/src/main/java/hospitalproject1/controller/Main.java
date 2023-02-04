package hospitalproject1.controller;

import java.util.Scanner;

import hospitalproject1.dao.*;
import hospitalproject1.dto.*;

public class Main {

	static int pid;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Hospital hospital = new Hospital();
		HospitalDao hospitalDao = new HospitalDao();
		
		Branch branch = new Branch();
		BranchDao branchDao = new BranchDao();

		Address address = new Address();
		AddressDao addressDao = new AddressDao();

		Person person = new Person();
		PersonDao personDao = new PersonDao();

		Encounter encounter = new Encounter();
		EncounterDao encounterDao = new EncounterDao();
		
		MedOrder medOrder=new MedOrder();
		MedOrderDao medOrderDao=new MedOrderDao();
		
		MedItems medItems=new MedItems();

		System.out.println("Enter the choice \n 1.Hospital Interface \n 2.Person Interface");
		int choice1 = scanner.nextInt();
		switch (choice1) {
		case 1: {
			int choice;
			boolean flag = true;
			do {
				System.out.println("Enter the choice \n 1.Save Hospital \n 2.Save Branch \n 3.Save Address \n 4.Exit");
				choice = scanner.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter the Hospital id");
					int hid = scanner.nextInt();
					System.out.println("Enter the Hospital name");
					String hname = scanner.next();
					System.out.println("Enter the Hospital email");
					String email = scanner.next();
					System.out.println("Enter the Hospital website");
					String website = scanner.next();

					hospital.setHid(hid);
					hospital.setHname(hname);
					hospital.setEmail(email);
					hospital.setWebsite(website);

					hospitalDao.saveHospital(hospital);
				}
					break;
				case 2: {
					System.out.println("Enter the Branch id");
					int bid = scanner.nextInt();
					System.out.println("Enter the Branch name");
					String bname = scanner.next();
					System.out.println("Enter the Branch city");
					String city = scanner.next();
					System.out.println("Enter the Branch state");
					String state = scanner.next();
					System.out.println("Enter the Branch country");
					String country = scanner.next();

					branch.setBid(bid);
					branch.setBname(bname);
					branch.setCity(city);
					branch.setState(state);
					branch.setCountry(country);

					System.out.println("Enter the Hospital id");
					int hid = scanner.nextInt();

					branchDao.saveBranch(hid, branch);
				}
					break;
				case 3: {
					System.out.println("Enter the Address id");
					address.setAid(scanner.nextInt());
					System.out.println("Enter the Address cross");
					address.setCross(scanner.next());
					System.out.println("Enter the Address street");
					address.setStreet(scanner.next());

					System.out.println("Enter the Branch id");
					int bid = scanner.nextInt();

					addressDao.saveAddress(bid, address);
				}
					break;
				default:
					flag = false;
				}
			} while (flag);
		}

			break;

		case 2: {
			int choice;
			boolean flag = true;
			do {
				System.out.println(
						"Enter the choice \n 1.Save Person \n 2.Save Encounter \n 3.Save MedOrder \n 4.Save MedItems \n 5.Get All Person");
				choice = scanner.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter the Person id");
					pid = scanner.nextInt();
					System.out.println("Enter the Person name");
					String pname = scanner.next();
					System.out.println("Enter the Person address");
					String paddress = scanner.next();
					System.out.println("Enter the Person phone");
					long phone = scanner.nextLong();

					person.setPid(pid);
					person.setPname(pname);
					person.setPaddress(paddress);
					person.setPhone(phone);

					personDao.savePerson(person);
				}

					break;

				case 2: {
					System.out.println("Enter the Encounter id");
					encounter.setEid(scanner.nextInt());
					System.out.println("Enter the Encounter disease");
					encounter.setDisease(scanner.next());
					System.out.println("Enter the Encounter date");
					encounter.setDate(scanner.next());

					System.out.println("The branches are: ");
					branchDao.getAllBranch();
					System.out.println("Select the Branch you want to admit");
					int bid = scanner.nextInt();

					encounterDao.saveEncounter(pid, bid, encounter);
				}
					break;
				case 3: {
					System.out.println("Enter the MedOrder id");
					medOrder.setMid(scanner.nextInt());
					System.out.println("Enter the MedOrder date");
					medOrder.setDate(scanner.next());
					System.out.println("Enter the MedOrder prescribed doctor");
					medOrder.setDoctor(scanner.next());
					
					System.out.println("Enter the Encounter id");
					int eid=scanner.nextInt();
					
					medOrderDao.saveMedOrder(eid, medOrder);
				}break;
				case 4:{
					System.out.println("Enter the MedItems bill id");
					medItems.setBill_id(scanner.nextInt());
					System.out.println("enter tablet name");
					medItems.setTab_name(scanner.next());
					System.out.println("enter bill amount");
					medItems.setBill_amount(scanner.nextInt());
					medItems.setMedOrder(medOrder);
				}

				default:

				}
			} while (flag);
		}

		default:
			break;
		}

	}

}