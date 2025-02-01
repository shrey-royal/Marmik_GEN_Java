class Parent {
    void printParent() {
        System.out.println("I'm from Parent class");
    }
}

class Child extends Parent {
    void printChild() {
        System.out.println("I'm from Child class");
    }
}

public class Single {
    public static void main(String[] args) {
        Child c = new Child();
        c.printParent();
        c.printChild();
    }
}
