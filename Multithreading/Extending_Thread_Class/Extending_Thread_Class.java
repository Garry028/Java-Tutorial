package Multithreading.Extending_Thread_Class;

class myThread extends Thread
{
    public void run()
    {
        int i=0;
       while (i<5) {
           System.out.println("The thread is runnning");
           System.out.println("I am happy !");
           i++;
       }
    }
}
class myThread1 extends Thread
{
    public void run()
    {int i=0;
       while (i<5) {
           System.out.println("The thread1 is runnning");
           System.out.println("I am happy1 !");
           i++;
       }
    }
}


public class Extending_Thread_Class {
    public static void main(String[] args) {
        myThread t=new myThread();
        myThread1 t1=new myThread1();

       t.start();// the start method automatically call the run() 
       t1.start();
    }
}

// Concurrency Problems
// Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The problems that result from this are called concurrency problems.
// To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.