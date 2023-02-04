package check;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
public class Ok {
	public static void main(String[] args) throws SQLException, IOException {
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fileInputStream=new FileInputStream("sunil.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		//create connection
		Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		//create preparedstatement
		PreparedStatement preparedStatement=connection.prepareStatement("insert into sunil values(?,?)");
		preparedStatement.setInt(1,3);
		preparedStatement.setString(2,"mani");
		//execute 
		preparedStatement.execute();
		//close
		connection.close();
		System.out.println("ho");
	}
}
