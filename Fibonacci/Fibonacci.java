package Fibonacci;

import java.util.List;

public class Fibonacci {
    Fibonacci(List<String> fibonacciList, int length){
        int first = 0;
        int second = 1;
        int temp;

        for (int count = 1; count <= length; count++) {
            fibonacciList.add("" + first);
            first += second;
            temp = first;
            first = second;
            second = temp;
        }
    }
}
