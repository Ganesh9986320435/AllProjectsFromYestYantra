import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sound.sampled.Line;

import com.mysql.cj.xdevapi.Statement;

public class Second {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/csv", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into hello values(?,?)");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Hp\\Music/hello.csv"));
		bufferedReader.readLine();
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String s[] = line.split(",");
			PreparedStatement preparedStatement2 = connection.prepareStatement("select name from hello where id=?");
			preparedStatement2.setInt(1, Integer.parseInt(s[0]));
			System.out.println();
			if (preparedStatement2.executeQuery().next() == false) {
				preparedStatement.setInt(1, Integer.parseInt(s[0]));
				preparedStatement.setString(2, s[1]);
				preparedStatement.execute();
			}
		}
		connection.close();
	}
}