package student_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student2 {
	public static void main(String[] args) throws Exception {	
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String userid="root";
		String pass="root";
		String delete="delete from student where id=2";
		//load or register driver
		Class.forName(classname);
		//establish connection
		Connection connection=DriverManager.getConnection(url,userid,pass);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute(delete);
		//CLOSE
		connection.close();	
}
}
