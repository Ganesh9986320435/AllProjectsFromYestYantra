import java.util.Scanner;

public class UserDriver {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the choice \n 1.insert \n 2.update \n 3.delete \n 4.to see");
		int choice=scanner.nextInt();
		UserCrud userCrud=new UserCrud();
		switch (choice) {
		case 1:
			User user=new User();
			user.setId(1);
			user.setUname("gani");
			user.setPassString("oooo");
			user.setEmail("hi@vangi");
			user.setCno(9986320435l);
			userCrud.Insert(user);
			System.out.println("+++++++++++++++++++++++++++++++++++");
			break;
		case 2:
			User user1=new User();
			user1.setUname("mani");
			user1.setCno(9986320435l);
			userCrud.update(user1);
			System.out.println("+++++++++++++++++++++++++++++++++++");
		case 3:
			User user2=new User();
			user2.setCno(9986320439l);
			userCrud.delete(user2);
			System.out.println("+++++++++++++++++++++++++++++++++++");
			break;
		case 4:
			User user3=new User();
			userCrud.select(user3);
			System.out.println("+++++++++++++++++++++++++++++++++++");
			break;
		}
}
}
