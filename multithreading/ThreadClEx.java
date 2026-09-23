package multithreading;

class MyThread extends Thread {
    // using thread class (contains abstract method) or runnable interface
    public void run() { // only run method works here because its the only method in the interface //we
                        // can use this method with the help of over-riding
        // run method contains the task that the thread executes
        System.out.println("Thread is running.");

    }
}

public class ThreadClEx {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // built in method
        MyThread t2 = new MyThread();
        t2.start(); // starts a new thread

        Thread t3 = new Thread("NEWTHREAD"); // custom name for the thread
        t3.start();
        System.out.println(t3.getName()); // returns thread name (compiler given)
        // execution is fast so it appears first

    }

}
