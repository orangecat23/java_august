package multithreading;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("task 1" + i); // string concatenation
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("task 2" + i); // string concatenation
        }
    }
}

public class TaskEx {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();

    }

}
