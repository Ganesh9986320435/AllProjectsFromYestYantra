import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Five {
	public static void main(String[] args) throws IOException {
		A a=new A(16, "gani");
		FileOutputStream fileOutputStream=new FileOutputStream("ghi.txt",true);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(a);
		objectOutputStream.close();
	}
}
class A implements Serializable
{
	int id;
	String name;
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
