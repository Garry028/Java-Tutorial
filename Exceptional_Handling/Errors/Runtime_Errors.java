package Exceptional_Handling.Errors;
import java.util.*;
public class Runtime_Errors {
    
    public static void main(String[] args) {
        try{
          int a,b;
          Scanner sc=new Scanner(System.in);
          int [] marks =new int[5];
          System.out.println("Enter the marks of students: ");
          for (int i = 0; i < 6; i++) {
              
            marks[i]=sc.nextInt();
              
          }
          System.out.print("The array is: ");
          for (int i = 0; i < 5; i++) {
              System.out.println(marks[i] + " ");
          }
          
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
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception Occurred !!!");
        }
    }
}
