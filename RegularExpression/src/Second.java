import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        String patternString = "fox";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()) {
            System.out.println("Found a match at index " + matcher.start() + " to " + (matcher.end()-1));
        }
    }
}
