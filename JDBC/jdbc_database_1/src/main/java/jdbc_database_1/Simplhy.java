package jdbc_database_1;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Simplhy {
	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new Driver());
		DriverManager.getConnection("null").prepareStatement("").execute();
	}
}
