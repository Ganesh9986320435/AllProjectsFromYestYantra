package dto;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import dao.Employeedao;
@Component
public class Main {
	
	@Autowired
	Scanner scanner;
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
				BankAccount account = context.getBean("bankAccount", BankAccount.class);
		Employee employee = context.getBean("employee", Employee.class);
		Employeedao dao = context.getBean("employeedao", Employeedao.class);
		Main main=context.getBean("main",Main.class);
		boolean flag = true;
		do {
			System.out.println(
					"Enter the choice \n 1.Save Employee \n 2.Update Employee \n 3.Delete Employee based on Id \n 4.Get Employee By Id \n  5.Exit");
			int choice = main.scanner.nextInt();
//			switch (choice) {
//			case 1: {
//				System.out.println("Enter the Bank Name");
//				String bname = scanner.next();
//				System.out.println("Enter the Bank Address");
//				String baddress = scanner.next();
//				System.out.println("Enter the Bank Ifsc");
//				String ifsc = scanner.next();
//
//				account.setName(bname);
//				account.setAddress(baddress);
//				account.setIfsc(ifsc);
//
//				System.out.println("Enter the Employee Name");
//				String name = scanner.next();
//				System.out.println("Enter the Employee Address");
//				String address = scanner.next();
//				System.out.println("Enter the Employee Phone");
//				long phone = scanner.nextLong();
//
//				employee.setName(name);
//				employee.setAddress(address);
//				employee.setPhone(phone);
//				employee.setBankAccount(account);
//
//				dao.save(employee);
//			}
//				break;
//			case 2: {
//				System.out.println("Enter the Bank id");
//				int bid = scanner.nextInt();
//				System.out.println("Enter the Bank Name");
//				String bname = scanner.next();
//				System.out.println("Enter the Bank Address");
//				String baddress = scanner.next();
//				System.out.println("Enter the Bank Ifsc");
//				String ifsc = scanner.next();
//
//				account.setId(bid);
//				account.setName(bname);
//				account.setAddress(baddress);
//				account.setIfsc(ifsc);
//
//				System.out.println("Enter the Employee id");
//				int id = scanner.nextInt();
//				System.out.println("Enter the Employee Name");
//				String name = scanner.next();
//				System.out.println("Enter the Employee Address");
//				String address = scanner.next();
//				System.out.println("Enter the Employee Phone");
//				long phone = scanner.nextLong();
//				employee.setId(id);
//				employee.setName(name);
//				employee.setAddress(address);
//				employee.setPhone(phone);
//				employee.setBankAccount(account);
//
//				dao.update(employee);
//			}
//				break;
//			case 3: {
//				System.out.println("Enter the Employee id");
//				int id = scanner.nextInt();
//
//				dao.remove(id);
//			}
//				break;
//			case 4: {
//				System.out.println("Enter the Employee id");
//				int id = scanner.nextInt();
//
//				Employee e=dao.fetchbyid(id);
//				System.out.println(e.getName());
//				System.out.println(e.getAddress());
//			}
//				break;
//			
//			default:
//				flag = false;
//			}

		} while (flag);
		
	}
}
