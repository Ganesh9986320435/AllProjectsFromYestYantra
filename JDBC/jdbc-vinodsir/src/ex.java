
public class ex {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 10 };
		int b[] = { 5, 6, 7, 8, 9,12 };
		int c[] = new int[a.length + b.length];
		int a1 = 0;
		for (int i = 0; i < c.length; i++) {
			int b1 = 0;
			int count = 0;
			for (int j = a1; j < a.length; j++) {
				if (a[a1] < a[j]) {
					count++;
				}
			}
			for (int k = 0; k < b.length; k++) {
				if (a1 < a.length) {
					if (a[a1] < b[k]) {
						count++;
					}
				}
			}
			if (a1 < a.length) {
				c[(c.length - 1) - count] = a[a1];
			}
			a1++;
		}
		int a2 = 0;
		for (int i = 0; i < b.length; i++) {
			int b2 = 0;
			int count = 0;
			for (int j = a2; j < a.length; j++) {
				if (b[a2] < a[j]) {
					count++;
				}
			}
			for (int k = 0; k < b.length; k++) {
				if (a2 < b.length) {
					if (b[a2] < b[k]) {
						count++;
					}
				}
			}
			c[(c.length - 1) - count] = b[a2];
			a2++;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}