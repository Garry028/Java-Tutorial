package Exceptional_Handling.Throws;
import java.util.*;

class NegativeNumberException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}

public class Throws {
    
    public static double area(int r) throws NegativeNumberException
    // throws tells that an Exception will occurred with negative number
    {
        if(r<0)
        {
            throw new NegativeNumberException();
        }
        double result=Math.PI*r*r;
        return result;
    }

    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        
        try
        {
            // Scanner sc=new Scanner(System.in);
            // System.out.println("Enter two numbers: ");
            // int a=sc.nextInt();
            // int b=sc.nextInt();
            // int c=divide(a,b);
            // System.out.println("The division of two number is: " + c);
            // sc.close();
            double ar=area(9);
            System.out.println(ar);
      
        }
        catch(Exception e)
        {
         System.out.println("Exception occurred , division by zero !!");
        }
        
    }
}
