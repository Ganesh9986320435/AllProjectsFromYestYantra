import java.util.Arrays;

import March9.main;

public class March12 {
	public static void main(String[] args) {
		int a[] = {0,4,6,2};
		int b[]=Arrays.stream(a).sorted().toArray();
		int c=b[b.length-1];
		for (int i = 0; i <= b[b.length-1]; i++) {
			for (int j=0;j<a.length;j++) {
				if (a[j] == c||a[j]>c) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			c--;
		}
	}
}
