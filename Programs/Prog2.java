package Programs;
/*
 *              METHOD - 1
 * 
 * A new Class world is created that extends Thread.
 * 
 * The run method is overridden to define the code that 
 * constitutes the new thread.
 * 
 * start method is called to initiate the new thread.
 */

class World extends Thread {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Prog2 {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        for(int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}


// INFINITE LOOPS
// class World extends Thread {
//     @Override
//     public void run() {
//         for( ; ; ) {
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }
//
// public class Prog2 {
//     public static void main(String[] args) {
//         World world = new World();
//         world.start();
//
//         for( ; ; ) {
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }

// INFINITE LOOPS NORMAL (Un reachable code):
// public class Prog2 {
//     public static void main(String[] args) {
//         for( ; ; ) {
//             System.out.println(Thread.currentThread().getName());
//         }
//
//         for( ; ; ) {
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }