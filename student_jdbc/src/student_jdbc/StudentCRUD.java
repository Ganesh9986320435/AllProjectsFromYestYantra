package student_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentCRUD {
	public Connection getconnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("check oce is your program is correct or not its has thrown A CLASS CAST EXCEPTION");
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		return connection;
	}
	public void inseStudent(int id, String name, int marks,String father_name,String address) throws Exception {
		Connection connection=getconnection();
		PreparedStatement preparedstatement=connection.prepareStatement("insert into student values(?,?,?,?,?)");
		preparedstatement.setInt(1,id);
		preparedstatement.setString(2,name);
		preparedstatement.setInt(3,marks);
		preparedstatement.setString(4,father_name);
		preparedstatement.setString(5,address);
		preparedstatement.execute();
		connection.close();	
	}
	public void updateStudent(int id, String name) throws Exception {
		Connection connection=getconnection();
		PreparedStatement preparedstatement=connection.prepareStatement("update student set id=? where name=?");
		preparedstatement.setInt(1,id);
		preparedstatement.setString(2,name);
		preparedstatement.execute();
		connection.close();	
	}
	public void deleteStudent(int id) throws Exception {
		Connection connection=getconnection();
		PreparedStatement preparedstatement=connection.prepareStatement("delete from student where id=?");
		preparedstatement.setInt(1,id);
		int count=preparedstatement.executeUpdate();
		if(count==1) {
			System.out.println("deleted");
		}
		else
		{
			System.out.println("not deleted");
		}
		connection.close();	
	}
	public void selectstudent() throws Exception {
		Connection connection = getconnection();
		PreparedStatement preparedstatement = connection.prepareStatement("select * from student ");
		ResultSet rs = preparedstatement.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
		}
		connection.close();
	}
}