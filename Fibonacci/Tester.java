package Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tester {
    public static void main(String[] args) {
        List<String> fibonacciList = new ArrayList<>();
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Fibonacci.Fibonacci series length? : ");
        int length = stdIn.nextInt();
        System.out.println();

        new Fibonacci(fibonacciList, length);

        System.out.print("Forward  : ");
        for (int counter = 0; counter < fibonacciList.size(); counter++) {
            String fibonacciElement = fibonacciList.get(counter);
            if ((counter < fibonacciList.size() - 1)) {
                System.out.print(fibonacciElement + ", ");
            } else {
                System.out.print(fibonacciElement + ".");
                System.out.println();
            }
        }

        System.out.print("Backwards: ");
        for (int counter = fibonacciList.size() - 1; counter >= 0; counter--) {
            String fibonacciElement = fibonacciList.get(counter);
            if ((counter > 0)) {
                System.out.print(fibonacciElement + ", ");
            } else {
                System.out.print(fibonacciElement + ".");
                System.out.println();
            }
        }

//        int[] arr = IntStream.range(-2, 3).toArray(); // will populate from -2 to 2 [before 3]
    }
}
