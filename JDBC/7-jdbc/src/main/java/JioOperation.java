import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JioOperation {
	static int id=0;;
	static int iteration=0;
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jiodb","root","root");
		return connection;
	}
	public void signIn(Jio jio) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into jio values(?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, jio.id);
		preparedStatement.setString(2, jio.name);
		preparedStatement.setString(3, jio.email);
		preparedStatement.setString(4, jio.password);
		preparedStatement.setString(5, jio.adress);
		preparedStatement.setString(6, jio.fbpass);
		preparedStatement.setString(7, jio.instapass);
		preparedStatement.setString(8, jio.whatspass);
		preparedStatement.setString(9, jio.snappass);
		preparedStatement.setString(10, jio.twitterpass);
		preparedStatement.execute();
		connection.close();
		System.out.println("successfully signed in");
	}
	public boolean logIn(String email,String password) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from jio");
//		preparedStatement.setInt(1, jio.id);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
		if(email.equals(resultSet.getString(3))&&password.equals(resultSet.getString(4)))
		{
			System.out.println("loged in");
			id=resultSet.getInt(1);
			if(resultSet.getString(8).equals("null"))
				iteration=1;
			else
				iteration=0;
			return true;
		}
		}
			return false;
	}
	public void updatePass(JioLoginpass jioLoginpass) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update jio set fbpass=?,instapass=?,whatspass=?,snappass=?,twitterpass=? where id=?");
		preparedStatement.setInt(6, id);
		preparedStatement.setString(1, jioLoginpass.fbpass);
		preparedStatement.setString(2, jioLoginpass.instapass);
		preparedStatement.setString(3, jioLoginpass.whatspass);
		preparedStatement.setString(4, jioLoginpass.snappass);
		preparedStatement.setString(5, jioLoginpass.twitterpass);
		preparedStatement.execute();
		connection.close();
	}
	public void getInfo() throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from jio where id=?");
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.println("id=" +resultSet.getInt(1));
			System.out.println( "name="+resultSet.getString(2));
			System.out.println("email="+ resultSet.getString(3));
			System.out.println( "pass="+resultSet.getString(4));
			System.out.println( "addrsess="+resultSet.getString(5));
			System.out.println( "fbpass="+resultSet.getString(6));
			System.out.println( "instpass="+resultSet.getString(7));
			System.out.println( "whatspass="+resultSet.getString(8));
			System.out.println("snappass="+ resultSet.getString(9));
			System.out.println("twitterpass="+ resultSet.getString(10));

			System.out.println("============================================");
		}
	}
	public void fbUpdate(String fbpass) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update jio set fbpass=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, fbpass);
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void instaUpdate(String instapass) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update jio set instapass=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, instapass);
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void whatsUpdate(String whatspass) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update jio set whatspass=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, whatspass);
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void snapUpdate(String snappass) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update jio set snappass=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, snappass);
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
	public void twitterUpdate(String twitterpass) throws Exception
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update jio set twitterpass=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, twitterpass);
		preparedStatement.execute();
		connection.close();
		System.out.println("done");
	}
}
