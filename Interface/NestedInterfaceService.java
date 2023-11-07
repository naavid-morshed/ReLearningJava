package Interface;

public class NestedInterfaceService implements Showable, Showable.Message {
    @Override
    public void show() {
        System.out.println("show() method runs");
    }

    @Override
    public void msg() {
        System.out.println("msg() method runs");
    }
}

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}
