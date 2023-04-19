
public class Eight {
	public static void main(String[] args) {
		put:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(j==5)
					break put;
				System.out.println(j);
			}
		}
	}
}
