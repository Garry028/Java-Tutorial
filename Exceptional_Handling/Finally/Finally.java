package Exceptional_Handling.Finally;
import java.util.*;
public class Finally {
    public static void main(String[] args) {
        try{
            int a,b;
            Scanner sc=new Scanner(System.in);
           
            System.out.println("Enter two numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            int c=a/b;
            System.out.println("Division of two numbers is: " + c);
            sc.close();
          }
          catch(InputMismatchException e)
          {
              System.out.println("Wrong input,enter integer as input ");
          }
          catch(ArithmeticException e)
          {
            System.out.println("Exception occured,division by zero !!!");
          }
          finally
          {
              System.out.println("Finally block will always run wheather exception occurred or not.");
          }
        
      }
    }


    //  The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort) . Sometime interviewer ask in the interview.



