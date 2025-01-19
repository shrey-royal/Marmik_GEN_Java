class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": " + 2 + " * " + i + " = " + 2*i);
        }
    }
}

public class CreateThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");

        t1.start();
        t2.start();

    }
}

/*
step 1:
make fibonacci function using recursion: the function will take n (terms).
now make 5 thread and give different fibonacci terms to run.

output: 
(t1, 0), (t2, 0), (t2, 1), (t1, 1), (t2, 2), ...

step 2:
make a simple fibonacci series function without using recursion
make 1 thread of simple function and another of recursive function

-> check which function gets you the fastest answer


*/