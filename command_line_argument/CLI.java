package command_line_argument;

public class CLI {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg); // works only when cli is used for relevant java code
        }
    }
}
