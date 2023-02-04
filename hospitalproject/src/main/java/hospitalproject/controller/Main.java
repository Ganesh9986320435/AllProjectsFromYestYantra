package hospitalproject.controller;

import java.util.Scanner;

import hospitalproject.dao.PersonCrud;
import hospitalproject.dto.Encounter;
import hospitalproject.dto.Hospital;
import hospitalproject.dto.Person;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		Person person=new Person(); 
//		PersonCrud personCrud=new PersonCrud();
//		System.out.println("enter person details");
//		System.out.println("enter person id");
//		person.setPid(scanner.nextInt());
//		System.out.println("enter person name");
//		person.setName(scanner.next());
//		System.out.println("enter person id");
//		person.setAddress(scanner.nextLine());
//		System.out.println("enter person phone number");
//		person.setPhone(scanner.nextLong());
//		personCrud.savePerson(person);
//		Encounter encounter=new Encounter();
//		System.out.println("enter the admission number");
//		encounter.setAdmission_no(scanner.nextInt());
//		System.out.println("enter the disease");
//		encounter.setDisease(scanner.next());
//		System.out.println("enter the ");
//		encounter.setConsulted_doctor(scanner.next());
//		Hospital hospital=new Hospital();
//		hospital.setId(0);
		Hospital hospital=new Hospital();
		hospital.setId(1);
		hospital.setName("APPOLO HOSPITALS");
		hospital.setCeo("DR.MANISH MATTO");
		Hospital hospital1=new Hospital();
		hospital1.setId(2);
		hospital1.setName("MEDANTA");
		hospital1.setCeo("DR.MANISH MATTO");
		Hospital hospital2=new Hospital();
		hospital2.setId(3);
		hospital2.setName("AIIMS");
		hospital2.setCeo("DR.BUTT");
		
	}
}
