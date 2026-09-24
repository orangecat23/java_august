
package thread;

// Creating a task by implementing the Runnable interface
class Task1 implements Runnable {

    // run() contains the task that each thread will execute
    public void run() {

        // Loop runs 6 times
        for (int i = 0; i < 6; i++) {

            // Prints the name of the current thread and the iteration number
            // System.out.println(i);
            System.out.println(Thread.currentThread().getName() + " running " + i);
        }
    }
}

public class PriorityThreadEx {

    public static void main(String[] args) {

        // Creating a Runnable task object
        Task1 task = new Task1();

        // Creating three threads using the same task
        Thread t1 = new Thread(task, "Task 1");
        Thread t2 = new Thread(task, "Task 2");
        Thread t3 = new Thread(task, "Task 3");

        // Setting the priority of each thread
        // MIN_PRIORITY = 1
        // MAX_PRIORITY = 10
        // NORM_PRIORITY = 5
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        // Starting all three threads
        t1.start();
        t2.start();
        t3.start();
    }
}
