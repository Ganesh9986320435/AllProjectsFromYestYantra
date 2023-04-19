package March14;

public class Seventh {

	public static void main(String[] args) {
		System.out.println(superDigit("593", 10));
	}

	public static int superDigit(String n, int k) {
		// Write your code here
		String mod = "";
		int finalans=0;
		for (int i = 0; i < k; i++) {
			mod = mod + n;
		}
		double l= Double.parseDouble(mod);
		String string="";
		while(true) {
		string=get(l);
		if(string.length()==1){
			finalans= Integer.parseInt(mod);
			break;
		}
		else {
			l=Double.parseDouble(string);
			}
		}
		return finalans;
	}
	public static String get(double l) {
		double sum = 0;
		while (l > 0) {
			double res = l % 10;
			sum = sum + res;
			l = l / 10;
		}
		return sum+"";
	}
}
