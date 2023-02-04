package _6jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentCRUD {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		return connection;
	}
	public void insertStudent(Student s) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?,?)");
		preparedStatement.setInt(1, s.getId());
		preparedStatement.setString(2, s.getName());
		preparedStatement.setInt(3, s.getMarks());
		preparedStatement.setString(4, s.getAddress());
		preparedStatement.setString(5, s.getFathername());
		preparedStatement.execute();
		connection.close();
		System.out.println("over");
	}
}
