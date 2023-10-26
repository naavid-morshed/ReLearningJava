package Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        List<String> fibonacciList = new ArrayList<>();
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Fibonacci.Fibonacci series length? : ");
        int length = stdIn.nextInt();
        System.out.println();

        new Fibonacci(fibonacciList, length);

        System.out.print("Output: ");

        for (int i = 0; i < fibonacciList.size(); i++) {
            String fibonacciElement = fibonacciList.get(i);
            if (!(i == fibonacciList.size() - 1)) {
                System.out.print(fibonacciElement + ", ");
            } else {
                System.out.print(fibonacciElement + ".");
                System.out.println();
            }
        }
    }
}
