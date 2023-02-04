import java.sql.*;
public class Program2 {
	public static void main(String[] args) throws Exception {
		//load or register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute("INSERT INTO EMPLOYEE VALUES(2,'GANI',9986320435,'TEST YANTRA','BELLARI')");
		//CLOSE
		connection.close();	
	}
}