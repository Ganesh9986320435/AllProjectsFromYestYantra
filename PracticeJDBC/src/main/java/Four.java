import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Four {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//registering driver explicetly
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fileInputStream=new FileInputStream("hi.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		//creating connection
		Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		//creating statement
		PreparedStatement preparedStatement=connection.prepareStatement("insert into luckydb values(?,?)");
		//execute prepared statement
		User user=new User();
		user.setId(5);
		user.setName("gani");
		User user1=new User();
		user1.setId(6);
		user1.setName("gani");
		List< User> list=new ArrayList<User>();
		list.add(user);
		list.add(user1);
		for (User user2 : list) {
			preparedStatement.setInt(1, user2.getId());
			preparedStatement.setString(2, user2.getName());
			preparedStatement.addBatch();
		}
		preparedStatement.executeBatch();
		//close connection
		connection.close();
	}
}
