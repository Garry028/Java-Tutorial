package Multithreading.Runnable_Interface;

class myThread implements Runnable {
    public void run() {
        for (int i = 0; i <5; i++) {
            
            System.out.println("Im a thread 1 ");
        }
    }
}

class myThread1 implements Runnable {
    public void run() {
        for (int i = 0; i <5; i++) {
            
            System.out.println("Im a thread 2 ");
        }    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        myThread mt = new myThread();
        Thread t = new Thread(mt);
         // we can't directly use start when runnable interface is used hence we've to create the object of the thread
        
        myThread1 mt1 = new myThread1();
        Thread t1 = new Thread(mt1);
        
        t.start();
        t1.start();
    }
}
