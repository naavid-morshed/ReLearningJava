package Downcasting;

class Mammal{
    String type;
    Mammal(String type){
        this.type = type;
        System.out.println(this.type + " superclass");
    }
}

class Human extends  Mammal{
    String type;
    Human(String type){
        super(type);
        this.type = type;
        System.out.println(this.type);
    }
}

public class Test {
    public static void main(String[] args) {
        Mammal m = new Mammal("mammal");
        Human h = (Human) m; // will throw runtime exception
    }
}
