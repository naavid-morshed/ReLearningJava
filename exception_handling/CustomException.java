package exception_handling;
import java.util.Scanner;
public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {

        System.out.print("Type your age : ");

        if (new Scanner(System.in).nextInt() < 18) throw new InvalidAgeException("You cannot vote");
        else System.out.println("You can vote.");
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String errMsg){
        super(errMsg);
    }
}
