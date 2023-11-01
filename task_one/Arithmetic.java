package task_one;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("First Number : ");
        float num1 = stdIn.nextInt();

        System.out.print("Second Number : ");
        float num2 = stdIn.nextInt();

        MathOperationImplementation mathOperation = new MathOperationImplementation();

        boolean checker = true;
        while (checker) {
            System.out.println("""
                    a) Type 1 to perform addition        b) Type 2 to perform subtraction
                    c) Type 3 to perform multiplication  d) Type 4 to perform division
                    e) type 5 to take new inputs         f) type 6 to exit operation""");
            int userInput = stdIn.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Your numbers : " + (int) num1 + " & " + (int) num2 + ".");
                    System.out.println("After addition : " + mathOperation.adder(num1, num2));
                    break;
                case 2:
                    System.out.println("Your numbers : " + (int) num1 + " & " + (int) num2 + ".");
                    System.out.println("After subtraction : " + mathOperation.subtractor(num1, num2));
                    break;
                case 3:
                    System.out.println("Your numbers : " + (int) num1 + " & " + (int) num2 + ".");
                    System.out.println("After multiplication : " + mathOperation.miltiplier(num1, num2));
                    break;
                case 4:
                    System.out.println("Your numbers : " + (int) num1 + " & " + (int) num2 + ".");
                    System.out.println("After division : " + mathOperation.divider(num1, num2));
                    break;
                case 5:
                    System.out.print("First Number : ");
                    num1 = stdIn.nextInt();
                    System.out.print("Second Number : ");
                    num2 = stdIn.nextInt();
                    break;
                case 6:
                    checker = false;
                    break;
                default:
                    System.out.println("Wrong input, restarting process");
            }
        }
    }
}
