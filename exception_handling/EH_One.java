package exception_handling;

public class EH_One {
    public static void main(String[] args) throws Throwable {
        int a = 200;
//        try {
//            a = 50 / 0;
//        } catch (ArithmeticException exception) {
//            System.err.println(exception.getMessage()); // only the message
//            exception.printStackTrace(System.err); // entire stack trace
//            throw exception.getMessage(); // this will terminate the program after executing finally
//        } finally {
//            System.out.println(a);
//        }
        System.out.println(divider(10, 2));
//        System.out.println(divider(10,0));
        System.out.println(a);
    }

    public static int divider(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
//            return 0;
            throw e;
        }
    }
}
