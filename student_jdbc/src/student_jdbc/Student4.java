package student_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student4 {
	public static void main(String[] args) throws Exception {	
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String userid="root";
		String pass="root";
		String select="select * from student";
		//load or register driver
		Class.forName(classname);
		//establish connection
		Connection connection=DriverManager.getConnection(url,userid,pass);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		ResultSet rs=statement.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println("========================");
		}
		//CLOSE
		connection.close();	
}
}
