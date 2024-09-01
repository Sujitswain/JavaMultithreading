package Programs;
/*
 *              METHOD - 2
 * 
 * A new Class world is created that implements Runnable.
 * 
 * The run method is overridden to define the code that 
 * constitutes the new thread.
 * 
 * Create an object of the world that implements Runnable.
 * 
 * Create an instance of the thread class by passing the 
 * instance of the world.
 * 
 * start method is called on the Thread object to initiate 
 * the new thread.
 */

class World implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Prog3 {
    public static void main(String[] args) {
        
        World world = new World();
        Thread t1 = new Thread(world);

        t1.start();

        for(int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}