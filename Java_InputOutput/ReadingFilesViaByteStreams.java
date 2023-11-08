package Java_InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFilesViaByteStreams {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStreamOne = new FileInputStream("./Java_InputOutput/demo.txt");
            FileInputStream fileInputStreamTwo = new FileInputStream("D:\\demo.txt");
            int i;
            System.out.print("Using Absolute Path : ");
            while ((i = fileInputStreamOne.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.print("\n\nUsing Relative Path: ");
            while ((i = fileInputStreamTwo.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}