abstract class Person {
    protected String name;
    protected int age;

    abstract void display();

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No.: " + rollNo);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Student s = new Student("Marmik", 19, 420);
        // s.display();

        //Anonymous Class
        // Person p = new Person("Marmik", 19) {
        //     @Override
        //     void display() {
        //         System.out.println("Name: " + name + "\nAge: " + age);
        //     }
        // };
        // p.display();

        // 2
        new Person("Marmik", 19) {
            @Override
            void display() {
                System.out.println("Name: " + name + "\nAge: " + age);
            }
        }.display();
    }
}

/*
Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstract Class: A class with the abstract keyword is called an abstract class. It can have abstract and non-abstract methods.

0%-100% abstraction is possible in abstract class.

Rules for Abstract class:

1. must declare with abstract keyword.
2. it can have abstract and non-abstract methods.
3. it cannot be instantiated.
4. it can have constructors and static methods also.
5. it can have final methods which will force the subclass not to change the body of the method.

*/