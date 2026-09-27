package synchronization;

class Count {
    int count = 0;

    synchronized void increment() {
        // void increment() {
        count++;
    }
}

public class Counter {
    public static void main(String[] args) throws Exception {
        Count c = new Count();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();

            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();

            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.count);
    }

}
