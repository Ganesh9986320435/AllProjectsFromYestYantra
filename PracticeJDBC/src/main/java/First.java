import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class First {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load or register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//creating connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lucky", "root", "root");
		//creating statement
		Statement statement=connection.createStatement();
		//execute statement
//		statement.execute("insert into luckydb values(1,'gani')");
		ResultSet resultSet=statement.executeQuery("select * from luckydb where id=2");
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}
		//close connection
		connection.close();
	}
}