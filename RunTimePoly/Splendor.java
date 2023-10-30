package RunTimePoly;

class Bike {
    Bike(){
        System.out.println("inside bike class");
    }
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    Splendor() {
        System.out.println("inside splendor class");
    }
    void run() {
        System.out.println("running safely with 60km");
    }
}

class Test{
    public static void main(String[] args) {
        Bike b = new Splendor();//upcasting
        b.run();

        System.out.println();
        Splendor s = new Splendor();
        s.run();
    }
}
