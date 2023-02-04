package jdbc___123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program1 {
	public static void main(String[] args) throws Exception {
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/persondb";
		String userid="root";
		String pass="root";
		String insert="INSERT INTO person VALUES(1,'GANI',9986320435)"; 
		String update="update person set name='ram' where id=2";
		String delete="delete from person where id=2";
		String select="select * from person";
		//load or register driver
		Class.forName(classname);
		//establish connection
		Connection connection=DriverManager.getConnection(url,userid,pass);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute(insert);
		statement.execute(update);
		statement.execute(delete);
		ResultSet rs=statement.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println("========================");
		}
		//CLOSE
		connection.close();	
	}
}
	
