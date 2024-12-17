// To illustrate method overriding in Java, consider a real-world scenario involving a banking system. In this example, we will create a base class called `Bank` that defines a method to get the interest rate. Different banks will have different implementations of this method.

class Bank {
    public double getInterestRate() {
        return 0;   //Default Implementation
    }
}

class SBI extends Bank {
    @Override   //this annotation confirms that the method is being overriden
    public double getInterestRate() {
        return 8.0;
    }
}

class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

class AXIS extends Bank {
    @Override
    public double getInterestRate() {
        return 9;
    }
}


public class Method_Overriding {
    public static void main(String[] args) {
        Bank bank = null;
        
        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate());
        
        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate());
        
        bank = new AXIS();
        System.out.println("AXIS Interest Rate: " + bank.getInterestRate());
    }
}

/*
-> Problem Statements

1. Problem Statement 1: Create a base class called `Animal` with a method `makeSound()`. Implement subclasses `Dog` and `Cat` that override this method to provide specific sounds for each animal (e.g., "Bark" for Dog and "Meow" for Cat). Write a program to demonstrate polymorphism by calling the `makeSound()` method on an array of `Animal` references.

2. Problem Statement 2: Design a class hierarchy where you have a base class `Shape` with a method `draw()`. Create subclasses `Circle` and `Rectangle` that override the `draw()` method to print specific messages indicating which shape is being drawn (e.g., "Drawing Circle" and "Drawing Rectangle"). Implement a main program that creates instances of both shapes and calls their respective draw methods.



*/