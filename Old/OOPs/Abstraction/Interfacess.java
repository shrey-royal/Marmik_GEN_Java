interface Person {
    void display();
}

class Student implements Person {
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No.: " + rollNo);
    }
}

public class Interfacess {
    public static void main(String[] args) {
        Student s = new Student("Marmik", 19, 420);
        s.display();
    }
}

/*
Interface: Interface in Java is a blueprint of a class. It has static constants and abstract methods only.

> 100% abstraction is possible in interface.


POints to remember:

1. Interface in Java is a blueprint of a class. It has static constants and abstract methods only.
2. the data members of interface are public, static and final by default.
3. no need to use abstract keyword with methods.
4. it cannot be instantiated.
5. it can only be implemented by those classes which inherit it.
6. it cannot have constructors.

*/