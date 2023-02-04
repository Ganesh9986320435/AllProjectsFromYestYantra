import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class UserCrud {
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","root");
		return connection;
	}
	public void Insert(User u) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("Insert into user values(?,?,?,?,?)");
		preparedStatement.setInt(1, u.getId());
		preparedStatement.setString(2, u.getUname());
		preparedStatement.setString(3,  u.getPassString());
		preparedStatement.setString(4,  u.getEmail());
		preparedStatement.setLong(5,  u.getCno());
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void update(User u) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update user set uname=? where id=?");
		preparedStatement.setString(1, u.getUname());
		preparedStatement.setLong(2,  u.getId());
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void delete(User u) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from user where id=?");
		preparedStatement.setLong(1,u.getId());
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void select(User u) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from user");
		ResultSet rs=preparedStatement.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getLong(4));
			System.out.println("=====================");

		}
		connection.close();
		System.out.println("done");
	}
	}
