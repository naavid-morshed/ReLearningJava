package RegEx;

import java.util.regex.*;

public class RegOne {
    public static void main(String[] args) {
        String sentence = "Tall";
        Pattern patt = Pattern.compile("..l.");
        Matcher match = patt.matcher(sentence);

        System.out.println(match.matches());
//        System.out.println(Pattern.matches("[amn]?", "amn"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));
    }
}
