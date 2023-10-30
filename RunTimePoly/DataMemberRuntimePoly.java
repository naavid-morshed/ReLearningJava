package RunTimePoly;

class Baaike {
    int speedLimit = 90;
}

class Honda3 extends Baaike {
    int speedlimit = 150; //no such thing as run time polymorphism for data members
}

public class DataMemberRuntimePoly {
    public static void main(String[] args) {
        Baaike obj = new Honda3();
        System.out.println(obj.speedLimit);//90
    }
}
