package csm241;


interface I1 {

    int x = 100;

    void display();
}

class C1 implements I1 {

    @Override
    public void display() {
        System.out.println("This is from Interface I1");
    }

    void show() {
        System.out.println("This is from Class C1");
    }
}

public class Interface {

    public static void main(String[] args) {

        C1 obj = new C1();

        System.out.println(I1.x);

        obj.display();
        obj.show();
    }
}

