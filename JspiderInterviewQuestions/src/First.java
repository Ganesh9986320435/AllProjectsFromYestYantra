import java.util.Arrays;

public class First {
	public static void main(String[] args) {
		Object o[] = { 1, 2, new Object[] { 4, new int[] { 5, 6 }, 7 }, 10 };
		int count = 0;
		for (Object obj : o) {
			if (obj instanceof Integer) {
				System.out.println(obj);
			} else if (obj instanceof Object[]) {
				for (Object subObj : (Object[]) obj) {
					if (subObj instanceof Integer) {
						System.out.println(subObj);
					} else if (subObj instanceof int[]) {
						for (int i : (int[]) subObj) {
							System.out.println(i);
						}
					}
				}
			}
		}
	}
}
