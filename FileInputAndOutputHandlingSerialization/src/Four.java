import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Four {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("abc.txt",true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter,2);
		bufferedWriter.write("hellor");
		bufferedWriter.newLine();
		bufferedWriter.write("jiujbsk");
		bufferedWriter.close();
	}
}
