package Programs;
/**
 * User Threads and Daemon Threads
 * 
 */

public class Prog7 extends Thread{

    @Override
    public void run() {
        while(true) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Prog7 p1 = new Prog7();
        p1.setDaemon(true);
        p1.start();
        System.out.println("HI");
    }
}