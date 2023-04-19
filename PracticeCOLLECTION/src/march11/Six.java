package march11;

public class Six {
	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 1, 2 }, { 3, 4 } };
		char s[][] = { { '+', '-' }, { '*', '/' } };
		int ans[][] = new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				switch (s[i][j]) {
				case '+':

					ans[i][j] = a[i][j] + b[i][j];
					break;

				case '-':

					ans[i][j] = a[i][j] - b[i][j];

					break;

				case '*':

					ans[i][j] = a[i][j] * b[i][j];

					break;
				case '/':

					ans[i][j] = a[i][j] / b[i][j];

					break;
				}

			}

		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(ans[i][j]+"  ");
			}
			System.out.println("   ");
			}

	}
}
