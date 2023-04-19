import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class twelve {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("gani", "anu");
		System.out.println(list.stream().filter(n -> n.charAt(0) == 'a' || n.charAt(0) == 'A').collect(Collectors.toList()));
	}
}
