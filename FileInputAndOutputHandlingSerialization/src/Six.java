import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Six {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream=new FileInputStream("def.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		A a=(A)objectInputStream.readObject();
		A a1=(A)objectInputStream.readObject();
		System.out.println(a.id+" "+a1.name);
	}
}
