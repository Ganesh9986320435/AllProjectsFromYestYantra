package student_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Student_ps1 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter rank");
		int rank=sc.nextInt();
		System.out.println("enter marks");
		int marks=sc.nextInt();
		System.out.println("enter address");
		String add=sc.next();
		System.out.println("enter fathername");
		String fname=sc.next();
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/tej";
		String username="root";
		String password="root";
		String query="insert into student values(?,?,?,?,?)";
		//load or Register Driver 
		Class.forName(classname);
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		//create Statement
		PreparedStatement preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,rank);
		preparedstatement.setString(2,name);
		preparedstatement.setInt(3,marks);
		preparedstatement.setString(4,add);
		preparedstatement.setString(5,fname);
		preparedstatement.execute();
		connection.close();
		System.out.println("inserted");
	}

}
