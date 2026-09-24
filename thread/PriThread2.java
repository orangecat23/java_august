package thread;

class PriThread2 extends Thread {
    public PriThread2(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
    }

    public static void main(String[] args) {
        PriThread2 t1 = new PriThread2("Thread 1", 3);
        PriThread2 t2 = new PriThread2("Thread 2", 7);
        PriThread2 t3 = new PriThread2("Thread 3", 5);
        PriThread2 t4 = new PriThread2("Thread 4", 7);
        PriThread2 t5 = new PriThread2("Thread 5", 2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
