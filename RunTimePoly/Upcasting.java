package RunTimePoly;

public class Upcasting {
    public static void main(String[] args) {
        Child obj1 = new Child();
        Parent obj2 = new Child(); // obj2 can only access overridden methods from child or methods from parent
        System.out.println(obj1.methodOne((float) 2));
        System.out.println(obj2.methodOne(1,2)); // overridden method runs
    }
}

class Parent {

    public int methodOne(int a, int b) {
        System.err.println("Inside Parent error() method");
        return a + b;
    }
}

class Child extends Parent {

    public int methodOne(int a) {
        System.err.println("Inside Child error() method");
        return 10 + a;
    }

    public int methodOne(int a, int b) {
        System.err.println("Inside Parent error() method");
        return a + b +b;
    }

    public float methodOne(float a) {
        System.err.println("Inside overloaded Child method");
        return 12 + a;
    }
}
