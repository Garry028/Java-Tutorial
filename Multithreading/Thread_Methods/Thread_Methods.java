package Multithreading.Thread_Methods;

class myThread extends Thread {
    public myThread(String name) {
        super(name);
    }

    public void run()

    {
        int i=0;
        while (i<10) {

            System.out.println("Thanks man 1 ");
            try{


                Thread.sleep(200);
                // this will pause the execution of the thread 1 for 450 sec till then thread 2 will execute
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
           
            }
            i++;
        }
    }
}

class myThread1 extends Thread {

    public void run()

    {
        
        int i=0;
        while (i<10) {

            System.out.println("Thanks man 2 ");
            i++;
        }
    }
    }


public class Thread_Methods {
    public static void main(String[] args) {
        myThread mt = new myThread("Garry");
        myThread1 mt1 = new myThread1();

        mt.start();

        System.out.println("Is Thread1 is alive ?: "+ mt.isAlive());// returns true if thread is alive
        System.out.println("Is Thread2 is alive ?: "+ mt1.isAlive());


        try
        {
            mt.join();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        // mt.join() tells to thread2 wait untill thread1 execution is over

        mt1.start();

        System.out.println("Is Thread1 is alive ?: "+ mt.isAlive());
        System.out.println("Is Thread2 is alive ?: "+ mt1.isAlive());
    
    }
}
