import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {
        int[] numArray = new int[10];

        for (int counter = 0; counter < numArray.length; counter++) {
            numArray[counter] = counter;
            System.out.print(numArray[counter]);
        }
        System.out.println();

        int[] numArrayTwo = IntStream.range(0, 9).toArray();
        for (int num : numArrayTwo) {
            System.out.print(num);
        }
        System.out.println();
    }
}
