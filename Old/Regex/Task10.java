import java.util.regex.*;

public class Task10 {

    // public static String highlightText(String input, String searchTerm) {
    //     Pattern pattern = Pattern.compile("\\b" + searchTerm + "\\b", Pattern.CASE_INSENSITIVE);
    //     Matcher matcher = pattern.matcher(input);
    //     StringBuffer output = new StringBuffer();

    //     while(matcher.find()) {
    //         matcher.appendReplacement(output, "<span class='highlight'>" + matcher.group() + "</span>");
    //     }
    //     matcher.appendTail(output);

    //     return output.toString();
    // }

    public static String highlightText(String input, String searchTerm) {
        return input.replaceAll("(?i)\\b" + Pattern.quote(searchTerm) + "\\b", "<span class='highlight'>$0</span>");
    }

    public static void main(String[] args) {
        String input = "This is a sample text. It contains some sample data.";
        String searchTerm = "sample";
        String highlightedText = highlightText(input, searchTerm);

        System.out.println(highlightedText);
    }
}
