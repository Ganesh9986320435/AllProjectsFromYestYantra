import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load or register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//creating connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lucky", "root", "root");
		//creating preparedstatement
		PreparedStatement preparedStatement=connection.prepareStatement("select * from luckydb where id=?");
		preparedStatement.setInt(1, 3);
		//executing prepared statement
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}
		//close connection
		connection.close();
	}
}
