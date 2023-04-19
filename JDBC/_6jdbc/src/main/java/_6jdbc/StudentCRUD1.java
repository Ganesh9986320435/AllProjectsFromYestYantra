package _6jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentCRUD1 {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		return connection;
	}
	public void insertStudent(Student s) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("update student set name=? where id=?");
		preparedStatement.setInt(2, s.getId());
		preparedStatement.setString(1, s.getName());
		preparedStatement.execute();
		connection.close();
		System.out.println("over");
	}
}
