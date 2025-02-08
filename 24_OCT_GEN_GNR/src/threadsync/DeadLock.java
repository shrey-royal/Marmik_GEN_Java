package threadsync;

public class DeadLock {
    /*
    public static void main(String[] args) {
        final String resource1 = "Chocolate 1";
        final String resource2 = "Chocolate 2";

        Thread t1 = new Thread("Kathan") {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    synchronized (resource2) {
                        System.out.println(currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        Thread t2 = new Thread("Marmik") {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println(currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    synchronized (resource1) {
                        System.out.println(currentThread().getName() + " got " + resource1);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
    */

    public static void main(String[] args) {
        final String resource1 = "Chocolate 1";
        final String resource2 = "Chocolate 2";

        Thread t1 = new Thread("Kathan") {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    synchronized (resource2) {
                        System.out.println(currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        Thread t2 = new Thread("Marmik") {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    synchronized (resource2) {
                        System.out.println(currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        t2.start();
        t1.start();
    }

}
