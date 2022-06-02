package Exceptional_Handling.Exception_Class;
import java.util.*;;
class MyException extends Exception
{
    @Override
    public String toString()
    {
        return super.toString() + " I am toString()";
    }
    @Override
    public String getMessage()
    {
        return super.getMessage() + " I am getMessage()";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if(a<99)
        {
            try{

                // throw new MyException();
                throw new ArithmeticException("This i an exception");
            }
            catch(Exception e)
           {
               System.out.println(e.getMessage());
            //    System.out.println(e.toString());
            //    System.out.println(e);
            e.printStackTrace();
            System.out.println("Finished");

           }
           System.out.println("Yes finished");
            
        }
    }
}
