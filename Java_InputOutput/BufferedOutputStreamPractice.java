package Java_InputOutput;

//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamPractice {
    public static void main(String[] args) {
        try {
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("./buffer.txt"));
            FileOutputStream outputStream = new FileOutputStream("./buffer.txt");
            System.out.print("Write something to file : ");
            String userInput = new Scanner(System.in).nextLine();
//            byte[] byteFormat = userInput.getBytes();
//            bufferedOutputStream.write(byteFormat);
//            bufferedOutputStream.flush();
//            bufferedOutputStream.close();
            outputStream.write(userInput.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}