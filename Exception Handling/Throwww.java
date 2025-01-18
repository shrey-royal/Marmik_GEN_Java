class Kathan {
    public static void study(int milliseconds) {
        if(milliseconds >= 1000) throw new ArithmeticException("Leave it");
        else System.out.println("Study Now...");
    }
}

class ClassWork {
    public static void loadClass(String path) throws ClassNotFoundException {
        if(path.isEmpty()) throw new ClassNotFoundException();
        else Class.forName(path);
    }
}


public class Throwww {
    public static void main(String[] args) {
        //Example 1: Throwing unchecked exception
        // Kathan.study(1200);   //exception may occur here
        // System.out.println("rest of the code");

        //Example 2: Throwing checked exception
        
        try {
            ClassWork.loadClass("java.lang.Scanner");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
Tasks:

1. Custom Exception in Banking System: Develop a simplified banking system in Java that utilizes custom exceptions using the 'throw' keyword. Implement scenarios where 'throw' is used to handle insufficient balance or invalid transaction exceptions.

2. Input Validation in a User Registration System: Write a Java program for a user registration system where the 'throw' keyword is employed to manage input validation errors. For instance, use 'throw' to handle cases like invalid email formats or missing required fields during user registration.

3. Exception Handling in a Calculator: Design a calculator program in Java that employs the 'throw' statement to manage arithmetic exceptions. Create situations where 'throw' is used to handle divide-by-zero errors or invalid mathematical operations.

4. Network Connection Error Handling: Develop a network handling module in Java where the 'throw' keyword is used to manage connection errors. Simulate scenarios where 'throw' is employed to handle cases like timeouts or unreachable hosts during network operations.

*/