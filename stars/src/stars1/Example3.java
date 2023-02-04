package stars1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rank");
		int rank=sc.nextInt();
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/tej";
		String username="root";
		String password="root";
		String query="select * from stars1 where rank_id=?";
		//load or Register Driver 
		Class.forName(classname);
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		//create Statement
		PreparedStatement preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,rank);
		ResultSet rs=preparedstatement.executeQuery();
		while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		}
		connection.close();
		System.out.println("done");
	}
}
