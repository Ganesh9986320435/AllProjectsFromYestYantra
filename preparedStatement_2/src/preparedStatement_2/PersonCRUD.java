package preparedStatement_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonCRUD {
	public Connection getconnection() throws Exception
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("check oce is your program is correct or not its has thrown A CLASS CAST EXCEPTION");
		}
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		return connection;
	}
//	public void savePerson(int id, String name, Long phone_no) throws Exception {
//		Connection connection=getconnection();
//		PreparedStatement preparedstatement=connection.prepareStatement("insert into person values(?,?,?)");
//		preparedstatement.setInt(1,id);
//		preparedstatement.setString(2,name);
//		preparedstatement.setLong(3,phone_no);
//		preparedstatement.execute();
//		connection.close();	
//	}
//	public void updatePerson(int id, String name) throws Exception {
//		Connection connection=getconnection();
//		PreparedStatement preparedstatement=connection.prepareStatement("update person set id=? where name=?");
//		preparedstatement.setInt(1,id);
//		preparedstatement.setString(2,name);
//		preparedstatement.execute();
//		connection.close();	
//	}
//	public void deletePerson(int id) throws Exception {
//		Connection connection=getconnection();
//		PreparedStatement preparedstatement=connection.prepareStatement("delete from person where id=?");
//		preparedstatement.setInt(1,id);
//		int count=preparedstatement.executeUpdate();
//		if(count==1) {
//			System.out.println("deleted");
//		}
//		else
//		{
//			System.out.println("not deleted");
//		}
//		connection.close();	
//	}
	public void selectPerson(int id) throws Exception {
		Connection connection=getconnection();
		PreparedStatement preparedstatement=connection.prepareStatement("select * from person where id=? ");
		preparedstatement.setInt(1,id);
		ResultSet rs=preparedstatement.executeQuery();
		while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getLong(3));
		}
		connection.close();	
	}
}
