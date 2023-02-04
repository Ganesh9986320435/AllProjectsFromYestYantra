import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee1 {
	public static void main(String[] args) throws Exception {
		String classname="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String userid="root";
		String pass="root";
		String insert="INSERT INTO EMPLOYEE VALUES(111,'pora',998632043,'TEST YANTRA','BELLARI')";
		String update="update employee set name='rak' where id=5";
		String delete="delete from employee where id=5";
		String select="select * from employee";
		//load or register driver
		Class.forName(classname);
		//establish connection
		Connection connection=DriverManager.getConnection(url,userid , pass);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute(insert);
//		statement.execute("INSERT INTO EMPLOYEE VALUES(79,'mANI',998632043,'TEST YANTRA','BELLARI')");
//		statement.execute("INSERT INTO EMPLOYEE VALUES(89,'lANI',998632043,'TEST YANTRA','BELLARI')");
		statement.execute(update);
		statement.execute(delete);
		ResultSet rs=statement.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println("========================");
		}
//		//CLOSE
		connection.close();	
	}
}

