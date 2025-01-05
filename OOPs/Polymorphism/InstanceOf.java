class Animal {}

class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceOf {
    public static void main(String[] args) {
        Animal a = new Dog();   //Upcasting (an objects get the memory of it's child)
        System.out.println(a instanceof Dog);

        Dog d = (Dog) a;    //Downcasting (When an object gets stored into it's original class)
        System.out.println(d instanceof Animal);

        // Cat c = (Cat) a;    //ClassCastException
        // System.out.println(c instanceof Cat);
    }
}
