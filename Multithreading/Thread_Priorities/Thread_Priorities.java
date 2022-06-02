package Multithreading.Thread_Priorities;

class myThread extends Thread {
    public myThread(String name) {
        super(name); // this will call the parameterized consturctor from thread class

    }

    public void run() {
        int i=0;
        while (i<1) {
            System.out.println("Thanks " + this.getName());
            System.out.println("I am thread");
            i++;
        }
    }

}

public class Thread_Priorities {
    public static void main(String[] args) {
        // ready queue: t1 t2 t3 t4 maintained by jvm
        myThread mt = new myThread("Garry");
        myThread mt1 = new myThread("Harry");
        myThread mt2 = new myThread("Darry");
        myThread mt3 = new myThread("Larry");
        myThread mt4 = new myThread("Carry (Most important)");

        mt4.setPriority(Thread.MAX_PRIORITY);// like this we can set the priority to certain thread
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);

        mt3.setPriority(Thread.MIN_PRIORITY);

        mt.setPriority(Thread.MIN_PRIORITY);

        mt.start();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
       System.out.println(mt4.getPriority()); // like this we can get the priority

    }
}
