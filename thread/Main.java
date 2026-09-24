package thread;

class NewCl extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Task1 implements Runnable {
    public void run() {
        for (int i = 0; i < 6; i++) {
            // System.out.println(i);
            System.out.println(Thread.currentThread().getName() + " running " + i);

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Thread t1 = new Thread(task, "NEWThread task 1");
        Thread t2 = new Thread(task, "NEWThread task 2");
        t1.start();
        // t1.start(); java.lang.IllegalThreadStateException
        t2.start();
    }

}
