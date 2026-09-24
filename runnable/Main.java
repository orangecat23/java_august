package runnable;

class Task1 implements Runnable {
    public void run() {
        System.out.println("Thread using runnable");
    }
}

public class Main {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Thread t1 = new Thread(task, "NEWTHREAD");
        t1.start();
        System.out.println(t1.getName());
    }

}
