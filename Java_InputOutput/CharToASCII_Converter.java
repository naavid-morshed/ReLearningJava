package Java_InputOutput;

import java.io.IOException;

public class CharToASCII_Converter {
    public static void main(String[] args) {
        int asciiValOfGivenChar = -999;
        try {
            System.out.print("Type a Char and get it's ASCII value : ");
            asciiValOfGivenChar = System.in.read(); // converts to ASCII
// System.in.close(); this is done by JVM, no need to close connections explicitly
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        System.out.println("Converted to ASCII : " + asciiValOfGivenChar);
        System.out.println("Converted back to Char : " + (char) asciiValOfGivenChar);
    }
}
