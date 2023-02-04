import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class JioDriver {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter the choice \n 1.signin \n 2.login \n 3.exit");
			int choice=scanner.nextInt();
			JioOperation jioOperation=new JioOperation();
			switch (choice) {
			case 1:
				System.out.println("enter the id");
				int id=scanner.nextInt();
				System.out.println("enter the name");
				String name=scanner.next();
				System.out.println("enter the email");
				String email=scanner.next();
				System.out.println("enter the password");
				String password=scanner.next();
				System.out.println("enter the address");
				String adress=scanner.next();
				Jio jio=new Jio(id, name, email, password,adress, "null", "null", "null", "null", "null");
				jioOperation.signIn(jio);
				break;
			case 2:
				System.out.println("enter the email");
				String email1=scanner.next();
				System.out.println("enter the pass");
				String password1=scanner.next();
				if(jioOperation.logIn(email1, password1))
				{
					if(JioOperation.iteration==1) {
					System.out.println("enter the fbpass");
					String fbpass=scanner.next();
					System.out.println("enter the instpass");
					String instapass=scanner.next();
					System.out.println("enter the whatspass");
					String whatspass=scanner.next();
					System.out.println("enter the snappass");
					String snappass=scanner.next();
					System.out.println("enter twitter pass");
					String twitterpass=scanner.next();
					JioLoginpass jioLoginpass=new JioLoginpass(fbpass, instapass, whatspass, snappass, twitterpass);
					jioOperation.updatePass(jioLoginpass);
					System.out.println("updated");
					}
					if(JioOperation.iteration==0) {
						jioOperation.getInfo();
						boolean flash=true;
						while(flash) {
						System.out.println("enter password choice which u need to change \n 1.fbpassword \n 2.instapass \n 3.whatspass \n 4.snappass \n 5.twitterpass \n 6.exit");
						int choose=scanner.nextInt();
						switch (choose) {
						case 1:
							System.out.println("enter new password");
							String fbpass=scanner.next();
							jioOperation.fbUpdate(fbpass);
							break;
						case 2:
							System.out.println("enter new password");
							String instapass=scanner.next();
							jioOperation.instaUpdate(instapass);
							break;
						case 3:
							System.out.println("enter new password");
							String whatspass=scanner.next();
							jioOperation.whatsUpdate(whatspass);
							break;
						case 4:
							System.out.println("enter new password");
							String snappass=scanner.next();
							jioOperation.snapUpdate(snappass);
							break;
						case 5:
							System.out.println("enter new password");
							String twitterpass=scanner.next();
							jioOperation.twitterUpdate(twitterpass);
							break;
						default:
							flash=false;
							break;
						}
						}
					}
				}
				else {
					System.out.println("enter correct email and password");
				}
				break;
			default:
				exit=false;
				System.out.println("THANK YOU");
				break;
			}
		}
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jiodb","root","root");
//		java.sql.Statement statement = connection.createStatement();
//		statement.execute("delete from jio where name='vinay' ");
//		connection.close();
//		System.out.println("done");
	}
}
