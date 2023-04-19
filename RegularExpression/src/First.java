import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher=pattern.matcher("9986320435");
		if(matcher.matches())
		{
			System.out.println("ok");
		}
		else {
			System.out.println("not ok");
		}
		System.out.println(Pattern.matches("[6-9][0-9]{9}", "9986320435"));
		
		
		String string[]= new String[]{"20"};
	}
}
