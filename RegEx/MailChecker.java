package RegEx;

import java.util.regex.Pattern;
import java.util.Scanner;

public class MailChecker {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String reGexPatterForMail = "[0-9a-zA-z]{3,10}[.][a-zA-z]{1,10}@[a-zA-z]{3,10}[.]com";

        System.out.println("Mail pattern is any length of chars or digits, then a dot, then multiple chars, then @ some alphabets then .com");
        System.out.print("Your mail? ");
        String mail = stdIn.nextLine();

        System.out.println(Pattern.matches(reGexPatterForMail ,mail));
    }
}
