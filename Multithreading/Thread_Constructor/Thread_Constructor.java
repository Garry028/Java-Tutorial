package Multithreading.Thread_Constructor;

class myThread extends Thread
{
    public myThread(String name)
    {
        super(name); // this will call the parameterized consturctor from thread class
      
    }
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("I am thread");
            i++;
        }
    }

}

public class Thread_Constructor {
    public static void main(String[] args) {
        myThread mt = new myThread("Garry");
        mt.start();
        System.out.println("The id of thread: " + mt.getId());
        System.out.println("The name of thread is: " + mt.getName());
    }
    // this are the properties of thread
}
