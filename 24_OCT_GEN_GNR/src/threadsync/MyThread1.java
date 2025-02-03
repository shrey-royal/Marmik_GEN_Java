package threadsync;

public class MyThread1 extends Thread {
    Table t;
    int n;

    public MyThread1(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    @Override
    public void run() {
        t.printTable(n);
    }
}
