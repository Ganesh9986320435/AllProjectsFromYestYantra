package stars1;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter rank");
		int rank=sc.nextInt();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/tej";
		String username="root";
		String password="root";
		String query="insert into stars1 values(?,?,?)";
		//load or Register Driver 
		Class.forName(classname);
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		//create Statement
		PreparedStatement preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,rank);
		preparedstatement.setString(2,name);
		preparedstatement.setInt(3,salary);
		preparedstatement.execute();
		connection.close();
		System.out.println("inserted");
	}
}
