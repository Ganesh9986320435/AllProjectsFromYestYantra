package jdbc_database_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonCRUD1 {
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		return connection;
	}
	public void savePoint(Person p) throws Exception {
		Connection connection=getConnection();
		PreparedStatement pr=connection.prepareStatement("update person set name=? where id=?");
		pr.setInt(1,p.getId());
		pr.setString(2,p.getName());
		pr.execute();
		connection.close();
		System.out.println("done");
	}
}
