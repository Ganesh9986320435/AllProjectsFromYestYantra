import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Eight {
	public static void main(String[] args) throws ParseException {
		String rci = "2023-01-01";
		String rco = "2023-01-09";
		Date fdate = new SimpleDateFormat("YYYY-MM-DD").parse(rci);
		Date tdate = new SimpleDateFormat("YYYY-MM-DD").parse(rco);
		long t1 = fdate.getTime();
		long t2 = tdate.getTime();
		System.out.println(t1+"    "+t2);
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		if (t1 < t2) {
			// 1 = 1000
			int count = 0;
			for (long i = t1; i <= t2; i += 86400000) {
				if (f.format(i).equals("2023-01-20") || f.format(i).equals("2023-01-23"))
					count++;
			}
			if (count == 0) {
				System.out.println("hi");
			} else {
				System.out.println("keoikjci");
			}
		}
	}
}
