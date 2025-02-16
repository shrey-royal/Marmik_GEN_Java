package collect.lissst;

import java.util.Stack;

public class Stacc {
    public static void main(String[] args) {
        Stack<Integer> n = new Stack<>();

        n.push(47);
        n.push(1234);
        n.push(345);
        n.push(5467);
        n.push(678);
        n.push(336);

        System.out.println(n);
        System.out.println("peek(): " + n.peek());
        System.out.println("pop(): " + n.pop());
        System.out.println(n.search(1234));
        System.out.println(n.empty());
        System.out.println(n.size());
    }
}
/*
LIFO - Last In First Out

Methods of Stack:
1. push() - adds an element to the stack
2. pop() - removes an element from the stack
3. peek() - returns the top element of the stack
4. empty() - returns true if the stack is empty
5. search() - returns the position of the element from the top of the stack
6. size() - returns the size of the stack

*/