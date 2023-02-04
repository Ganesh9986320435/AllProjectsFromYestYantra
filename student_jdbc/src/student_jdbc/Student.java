package student_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Student {
		public static void main(String[] args) throws Exception {	
			String insert="insert into student values(9,'uma',100,'banglore','hahhaha')";
			//load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			//create statement
			Statement statement=connection.createStatement();
			//execute statement
			statement.execute(insert);
			//CLOSE
			connection.close();	
			System.out.println("inserted");
	}
}
