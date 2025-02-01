import java.util.Random;

class FRT extends Thread {
    private int n;

    public FRT(int n) {
        this.n = n;
    }

    private int fibonacciRecursive(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    @Override
    public void run() {
        System.out.println("FRT - " + currentThread().getName() + ": " + fibonacciRecursive(n));
    }
}

class FIT extends Thread {
    private int n;

    public FIT(int n) {
        this.n = n;
    }

    private int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    @Override
    public void run() {
        System.out.println("FIT - " + currentThread().getName() + ": " +         fibonacciIterative(n));
    }
}

public class FibonacciThreads {
    public static void main(String[] args) {
        // Step 1: Multiple threads with recursive Fibonacci

        FRT t1 = new FRT(new Random().nextInt(50));
        FRT t2 = new FRT(new Random().nextInt(50));
        FRT t3 = new FRT(new Random().nextInt(50));
        FRT t4 = new FRT(new Random().nextInt(50));
        FRT t5 = new FRT(new Random().nextInt(50));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            Thread.sleep(1000); //Thread Waiting
        } catch (Exception e) {
            e.printStackTrace();
        }

        FIT t6 = new FIT(new Random().nextInt(50));
        FIT t7 = new FIT(new Random().nextInt(50));
        FIT t8 = new FIT(new Random().nextInt(50));
        FIT t9 = new FIT(new Random().nextInt(50));
        FIT t10 = new FIT(new Random().nextInt(50));

        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
