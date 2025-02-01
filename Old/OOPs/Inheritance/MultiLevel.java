class GrandFather {
    void grandFather() {
        System.out.println("GrandFather");
    }
}

class Father extends GrandFather {
    void father() {
        System.out.println("Father");
    }
}

class Child extends Father {
    void child() {
        System.out.println("Child");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.grandFather();
        c.father();
        c.child();
    }
}
