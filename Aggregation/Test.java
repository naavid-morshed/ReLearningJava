package Aggregation;

public class Test {
    public static void main(String[] args) {
//         alternative to inheritance, should I use it or not?
//         I should use it here as it Emp has a "has" relation with address
//         if there's an "is" relation then inheritance would be a better choice
        Address address2 = new Address("Detroit", "California", "USA");
        Emp employee2 = new Emp(111, "John Denver", address2);

        Emp employee1 = new Emp(112, "Naavid Morshed", new Address("Chittagong", "CTG", "Bangladesh"));

        employee1.display();
        employee2.display();
    }
}
