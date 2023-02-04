package log4j1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
public class PersonMain {
	static Person person2=new Person();
	static Logger logger=Logger.getLogger(PersonMain.class);
	static Layout layout=new PatternLayout("%d      %p     %m       %c      %M      %l %n");
	static Scanner scanner=new Scanner(System.in);
	static Person person=new Person();
	public static void main(String[] args) throws Exception {
		Appender appender=new FileAppender(layout,"C:/Users/Hp/Desktop/Log4j/example1.log");
		logger.addAppender(appender);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/riodb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into rio values(?,?,?,?,?)");
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "gani");
		preparedStatement.setString(3,"123");
		preparedStatement.setString(4, "123");
		preparedStatement.setDouble(5, 5000);
//		preparedStatement.execute();
		int count=3;
		while(count>0)
		{
			System.out.println("enter the email");
			String ai=scanner.next();
			System.out.println("enter the pass");
			String pass=scanner.next();
			PreparedStatement preparedStatement1=connection.prepareStatement("select * from rio");
			ResultSet resultSet= preparedStatement1.executeQuery();
			while(resultSet.next())
			{
				if(ai.equals(resultSet.getString(3))&&pass.equals(resultSet.getString(4)))
				{
					logger.info("valid");
					System.out.println("enter the amount to credit");
					double am=scanner.nextDouble();
					person.setBal(am);
					System.out.println("enter amount to debit");
					double am1=scanner.nextDouble();
					person.setBal(am-am1);
					System.out.println(person.getBal());
					break;
				}
				else {
					logger.info("invalid");
				}
			}
			count--;
		}
		logger.warn("your account is blocked");
	}
}
