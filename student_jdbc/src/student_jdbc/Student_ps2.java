package student_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Student_ps2 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rank");
		int rank=sc.nextInt();
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/tej";
		String username="root";
		String password="root";
		String query="delete from student where id=?";
		//load or Register Driver 
		Class.forName(classname);
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		//create Statement
		PreparedStatement preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,rank);
		preparedstatement.execute();
		connection.close();
		System.out.println("deleted");
	}
}
