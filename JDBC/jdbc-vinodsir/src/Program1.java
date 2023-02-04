import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program1 {
	public static void main(String[] args) throws Exception {
		int a[][][]=new int[2][3][4];
		//load or register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute("INSERT INTO PERSON VALUES(2,'RAKESH',9986455444)");
		//close
		connection.close();
		System.out.println("inserted");
	}
}
