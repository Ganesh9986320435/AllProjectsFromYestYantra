import java.sql.*;
import java.util.Scanner;

public class Employee_ps3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Id to be Updated");
		int id = sc.nextInt();
		System.out.println("Enter a name to be Updated");
		String name = sc.next();
		
		String className = "com.mysql.cj.jdbc.Driver";
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String query = "update employee set name = ? where id = ?";
		
		Class.forName(className);
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1,name );
		ps.setInt(2, id);
		
		boolean b = ps.execute();
		conn.close();
		System.out.println("Updated");
		System.out.println(b);
	}

}
