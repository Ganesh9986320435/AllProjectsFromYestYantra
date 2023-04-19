import java.io.FileWriter;
import java.io.IOException;

public class First {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("C:\\Users\\Hp\\Music/hello.csv",true);
		String string="7,gani \n";
		fileWriter.write(string);
		fileWriter.close();
	}
}
