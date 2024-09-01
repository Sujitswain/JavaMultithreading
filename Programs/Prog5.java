package Programs;
/**
 *          THREAD VS RUNNABLE
 *  
 *  If you have a class that is extending another class
 *  and want to create a thread of that we cannot extend
 *  we have to implement the Runnable Interface.
 * 
 *          THREAD METHODS:
 * 
 *  START   - 
 *  
 *  RUN     -
 *  
 *  SLEEP   -
 * 
 *  JOIN    -
 * 
 *  GET PRIORITY 
 *          - 
 * 
 *  SET PRIORITY
 *          - MIN=1, MAX=10, NORM=5 
 * 
 */

public class Prog5 extends Thread {

    public Prog5(String string) {
        super(string);
    }

    @Override
    public void run() {
        for(int i=1; i<6; i++) {
            String a = "";
            for(int j=0; j<10000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() 
                                + " - Priority: " + 
                                Thread.currentThread().getPriority()
                                + " - Count: " + 
                                i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Prog5 p1 = new Prog5("Low");
        Prog5 p2 = new Prog5("Medium");
        Prog5 p3 = new Prog5("High");
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MAX_PRIORITY);
        
        p1.start(); 
        p2.start();
        p3.start();
        
        // p1.join();
        System.out.println("Hello it over ...");   
    }       
}
