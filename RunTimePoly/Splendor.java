package RunTimePoly;

class Bike {
    Bike() {
        System.out.println("inside bike class");
    }
    void run() {
        System.out.println("running");
    }
}

final class Splendor extends Bike {
    Splendor() {
        System.out.println("inside splendor class");
    }
    void run() {
        System.out.println("running safely with 60km");
    }
}

final class MT15 extends Bike {
    MT15() {
        System.out.println("inside MT-15 class");
    }

    void run() {
        System.out.println("running recklessly at 105km");
    }
}

class Test{
    public static void main(String[] args) {
        Bike b = new Splendor(); //upcasting, preferred choice
        b.run();

        System.out.println();
        Splendor s = new Splendor();
        s.run();
    }
}
