package jdbc_database_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.w3c.dom.UserDataHandler;import com.mysql.cj.exceptions.RSAException;

public class PersonCRUD {
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		return connection;
	}
	public void signinPoint(ArrayList<Person> p) throws Exception {
		Connection connection=getConnection();
		PreparedStatement pr=connection.prepareStatement("insert into person values(?,?,?)");
		for (Person person : p) {
			pr.setInt(1, person.getId());
			pr.setString(2, person.getName());
			pr.setLong(3, person.getPhone());
			pr.addBatch();
		}
		pr.executeBatch();
		connection.close();
		System.out.println("done");
	}
}
