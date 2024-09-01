package Programs;
/**
 * INTERRUPT - 
 * 
 * YIELD
 *  
 */

public class Prog6 extends Thread{

    Prog6(String name) {
        super(name);
    }

    @Override
    public void run() {
        // try {
        //     Thread.sleep(1000);
        //     System.out.println("Thread is running.... ");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield();
        }

    }
    public static void main(String[] args) {
        Prog6 p1 = new Prog6("t1");
        Prog6 p2 = new Prog6("t2");
        p1.start();
        p2.start();
        // p1.interrupt();


        // System.out.println("HI");
    }    
}
