import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;
public class Third {
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
		Statement statement=connection.createStatement();
		//execute statement
//		statement.execute("insert into luckydb values(1,'gani')");
		ResultSet resultSet=statement.executeQuery("select * from luckydb where id=3");
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}
		//close connection
		connection.close();
	}
}