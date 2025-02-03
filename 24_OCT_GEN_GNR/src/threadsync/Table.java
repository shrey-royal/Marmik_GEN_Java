package threadsync;

public class Table {
//    synchronized void printTable(int n) {       // Synchronized Method
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * " + i + " = " + n*i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }

//    void printTable(int n) {       // Synchronized Block
//        synchronized (this) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(n + " * " + i + " = " + n*i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }

    synchronized static void printTable(int n) {       // Static Synchronization
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
