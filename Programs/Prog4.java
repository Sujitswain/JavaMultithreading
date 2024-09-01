package Programs;
/*
 *
 * A State is nothing but an ENUMwith all these fields
 * 
 *              THREAD LIFECYCLE
 * 
 * The lifecycle of a thread in java consists of several
 * states, which a thread can move through during its execution.
 * 
 * NEW          -   A thread is in this state when it is created
 *                  but not yet started.
 * 
 * RUNNABLE     -   After the start method is called, the thread 
 *                  becomes runnable. It's ready to run and is 
 *                  waiting for CPU time.
 * 
 * RUNNING(not there)      
 *              -   The thread is in this state when it is 
 *                  executing.
 * 
 * BLOCKED / WAITING / TIMED-WAITING     
 *              -   A thread is in this state when it is waiting
 *                  for a resource or for another thread to perform
 *                  an action.
 * 
 * TERMINATED   -   A thread is in this state when it has finished
 *                  executing.
 */

class MyThread extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            System.out.println("Running");
        }
    }
}

public class Prog4 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
