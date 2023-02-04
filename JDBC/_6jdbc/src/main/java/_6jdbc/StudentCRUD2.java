package _6jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentCRUD2 {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		return connection;
	}
	public void insertStudent(Student s) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM STUDENT WHERE ID=?");
		preparedStatement.setInt(1, s.getId());
		preparedStatement.execute();
		connection.close();
		System.out.println("over");
	}
}
