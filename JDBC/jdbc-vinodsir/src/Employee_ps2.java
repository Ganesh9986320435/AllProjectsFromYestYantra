import java.sql.*;
import java.util.Scanner;

public class Employee_ps2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Id to be Updated");
		int id = sc.nextInt();	
		String className = "com.mysql.cj.jdbc.Driver";
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String query = "delete from employee  where id = ?";
		
		Class.forName(className);
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		
		boolean b = ps.execute();
		conn.close();
		System.out.println("Deleted");
		System.out.println(b);
	}

}
