package march11;

public class Five {

	public static void main(String[] args) {
		String s = "40A3H2N";
		int num = 4;
		for (int i = 0; i < s.length(); i += 2) {
			String hi = "";
			for (int j = i + 1;;) {
				hi = hi + s.charAt(i);
				if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
					double d = Double.parseDouble(hi) / num;
					int d1 = Integer.parseInt(hi) / num;
					if (d1 != 0 && d1 == d) {
						for (int k = 0; k < d1; k++) {
							System.out.print(s.charAt(j));
						}
						break;
					} else {
						for (int k = 0; k < num; k++) {
							System.out.print(s.charAt(j));
						}
						break;
					}
				} else {
					j++;
					i++;
				}
			}
		}

	}
}
