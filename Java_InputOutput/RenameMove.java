package Java_InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class RenameMove {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try {
            System.out.print("Choose a name for your file : ");
            String fileName = "./FileStoreOne/" + stdIn.nextLine() + ".txt";
            FileOutputStream fileInputStream = new FileOutputStream(fileName);

            System.out.print("Write something to this file : ");
            fileInputStream.write(stdIn.nextLine().getBytes());
            fileInputStream.flush();
            fileInputStream.close();

            File file = new File(fileName);

            System.out.print("Choose a new name for your file : ");
            String newFileName = "./FileStoreTwo/" + stdIn.nextLine() + ".txt";

            boolean checker = file.renameTo(new File(newFileName));
            System.out.println(checker);
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
