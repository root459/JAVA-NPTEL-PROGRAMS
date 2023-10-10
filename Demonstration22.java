class B {
    void print() {
        System.out.println("Print method in class B");
    }
}

interface C {
    void print();
}

class A extends B implements C {
    @Override
    public void print() {
        System.out.println("Print method in class A (overrides B and implements C)");
    }
}

public class Demonstration22{
    public static void main(String[] args) {
        A a = new A();
        a.print(); // This will call the print method in class A.
    }
}