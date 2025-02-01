/*
Instace Initializer Block: it is used to initialize the instance data member.
Priority Wise: Constructor > super() > iib > body of constructor

Tasks:
1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.
2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.
3. Geometry Calculator: Create a class for calculating geometric shapes. Implement an instance initializer block to define default values for shape properties.
4. Time Zone Converter: Design a class for converting times between different time zones. Utilize an instance initializer block to set default time zone offsets.
*/

class Employee {
    private int empid;
    private String name;

    {
        System.out.println("This is Instance Initializer Block");
    }

    public Employee() {
        System.out.println("Default Constructor called!");
        this.empid = 0;
        this.name = "unknown";
    }

    public Employee(int empid, String name) {
        System.out.println("Paramterized Constructor called!");
        this.empid = empid;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Id: " + empid + ", Name: " + name);
    }
}

public class IIB {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();

        Employee e1 = new Employee(101, "Marmik");
        e1.display();
    }
}
