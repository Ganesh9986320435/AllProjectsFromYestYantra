package student_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Student_ps4 {
	public static void main(String[] args) throws Exception {	
		Scanner sc=new Scanner(System.in);
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String userid="root";
		String pass="root";
		System.out.println("enter rank");
		int rank=sc.nextInt();
		String select="select * from student where id=?";
		//load or register driver
		Class.forName(classname);
		//establish connection
		Connection connection=DriverManager.getConnection(url,userid,pass);
		//create statement
		PreparedStatement preparedstatement=connection.prepareStatement(select);
		preparedstatement.setInt(1,rank);
		//execute statement
		ResultSet rs=preparedstatement.executeQuery();
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
