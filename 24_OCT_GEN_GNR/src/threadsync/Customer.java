package threadsync;

public class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + ": going to withdraw...");

        if (this.amount < amount) {
            System.out.println(Thread.currentThread().getName() + ": Less balance; waiting for deposit...");
            try {
                wait(); // release the lock
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        this.amount -= amount;
        System.out.println(Thread.currentThread().getName() + ": withdraw completed...");
        notify();   //convert a waiting thread into in active state
    }

    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + ": going to deposit...");
        this.amount += amount;
        System.out.println(Thread.currentThread().getName() + ": deposit completed...");
        notify();
    }
}
