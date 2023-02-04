package student_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student3 {
	public static void main(String[] args) throws Exception {	
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String userid="root";
		String pass="root";
		String update="update student set name='ram' where id=2";
		//load or register driver
		Class.forName(classname);
		//establish connection
		Connection connection=DriverManager.getConnection(url,userid,pass);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute(update);
		//CLOSE
		connection.close();	
}
}