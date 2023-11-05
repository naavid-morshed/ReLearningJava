package protected_modifier;

class Parent {
    protected void msg() {
        System.out.println("Hello java");
    }
}

public class Child extends Parent {
    protected void msg() { // this has to be specified protected, default is more restrictive than protected
        System.out.println("Hello jobs");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.msg();
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj); // printing obj and obj.toString() does the same thing
    }
}
