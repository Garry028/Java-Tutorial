package Exceptional_Handling.Question;

import java.util.*;

public class Question_Exc_Hand {
    public static void main(String[] args) {
        int x, y, N, D;
        float Result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x");
        x = sc.nextInt();

        System.out.println("Enter the value of y");
        y = sc.nextInt();

        sc.close();

        try {
                N=x+y;
                D=x-y;
                Result=N/D;
                System.out.println("The result is: " + Result);
            
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero !!!");
            System.out.println(e);
        }
    }
}