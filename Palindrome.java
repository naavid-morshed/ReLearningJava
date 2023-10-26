public class Palindrome {
    public static void main(String[] args) {
        int number = 21212;
        StringBuilder reversed = new StringBuilder("" + number);
        String str = reversed.toString();
        reversed.reverse();

        if (reversed.toString().equals(str)) {
            System.out.print("The number " + number + " is a Palindrome");
        } else {
            System.out.print("The number " + number + " is not a palindrome");
        }
    }
}
