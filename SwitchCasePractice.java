public class SwitchCasePractice {
    public static void main(String[] args) {
        String[] listOfNames = {"morshed", "naavid", "bob"};
        for (String name : listOfNames) {
            switch (name) {
                case "naavid", "morshed": //multiple checker in one case
                    System.out.println(name);
                    break;
                case "bob":
                    System.out.println("Bob");
                    break;
            }
        }
    }
}
