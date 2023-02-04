import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeePs4 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Id to be displayed");
		int id = sc.nextInt();

		String className = "com.mysql.cj.jdbc.Driver";
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String query = "select * from employee  where id = ?";

		Class.forName(className);
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);

		ResultSet res = ps.executeQuery();
		while (res.next()) {
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			System.out.println(res.getLong(3));
			System.out.println(res.getString(4));
			System.out.println(res.getString(5));
		}
		conn.close();

	}
}
