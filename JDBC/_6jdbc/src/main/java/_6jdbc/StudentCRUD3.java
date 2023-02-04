package _6jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentCRUD3 {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		return connection;
	}
	public void insertStudent(Student s) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id=?");
		preparedStatement.setInt(1, s.getId());
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
		}
		connection.close();
		System.out.println("over");
	}
}
