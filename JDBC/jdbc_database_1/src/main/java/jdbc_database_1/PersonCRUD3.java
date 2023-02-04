package jdbc_database_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonCRUD3 {
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		return connection;
	}
	public void savePoint(Person p) throws Exception {
		Connection connection=getConnection();
		PreparedStatement pr=connection.prepareStatement("delete from person where id=?");
		pr.setInt(1,p.getId());
		pr.execute();
		connection.close();
		System.out.println("done");
	}
	
}
