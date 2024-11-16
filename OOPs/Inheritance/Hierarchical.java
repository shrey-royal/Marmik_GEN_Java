class Shape {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is a rectangle");
    }
}

class Square extends Shape {
    void printSquare() {
        System.out.println("This is a square");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printShape();
        r.printRectangle();
        
        Square s = new Square();
        s.printShape();
        s.printSquare();
        
        // Shape s;
        // s = new Shape();
        // s.printShape();
    }
}
