// final class A {
//     void fun() {
//         System.out.println("AAA");
//     }
// }

// class B extends A {
//     @Override
//     void fun() {
//         System.out.println("BBB");
//     }
// }

public class FinalKw {
    static int a;
    final static int speed = 120;
    
    public static void main(String[] args) {
        a = 23;
        System.out.println("a = " + a);
        System.out.println("speed = " + speed);

        a = 2783;
        // speed = 30;
        System.out.println("a = " + a);
        System.out.println("speed = " + speed);


    }
}

/*
Final Keyword:

1. Stops Inheritance
2. Stops method Overriding
3. Stops value change

*/
