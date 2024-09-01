package Programs;
/**
 * SYNCHRONIZATION
 *      Synchronized keyword is used to ensure that only
 *    one thread can access a block of code or a methodat a time.
 * 
 * RACE CONDITION:
 *      Race Condition occurs when multiple threads access and modify
 *    shared data concurrently, leading to unpredictable and incorrect
 *    results.
 * 
 *      Synchronization is used to ensure thread safety by allowing
 *    only one thread at a time to execute synchronized block or
 *    methods, thereby preventing race conditions. 
 * 
 *      SYNCHRONIZATION
 *          locks th resources to one thread
 *          Two types of locks:
 *              1. Intrinsic
 *                      These are built into every object in java.
 *                    You don't see them, but they're there. When 
 *                    you use a synchronized keyword, you're using 
 *                    these automatic locks. 
 * 
 *              2. Explicit
 *                      These are more advanced locks you can control
 *                    yourself using the lock class from 
 *                    java.util.concurrent.locks. You exlicitly say 
 *                    when to lock and unlock, giving you more control 
 *                    over how and when people can write in the notebook.
 * 
 */

class Counter {
    private int count = 0;

    // public synchronized void countIncrement() {
    //     this.count++;
    // }

    // critical section
    public void countIncrement() {
        synchronized (this) {        // this one instance
            this.count++;
        }
    }


    public int getCount() {
        return this.count;
    }

}

class MyThread extends Thread {

    private Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            counter.countIncrement();
        }
    }
}

public class Prog8 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(counter.getCount());
    }    
}
