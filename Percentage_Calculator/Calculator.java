package Percentage_Calculator;

import java.util.Scanner;

public class Calculator
{
 public static void main(String args[])
    {

        float m1, m2, m3, m4, m5, total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for m1: ");
        m1 = sc.nextFloat();

        System.out.println("Enter the marks for m2: ");
        m2 = sc.nextFloat();

        System.out.println("Enter the marks for m3: ");
        m3 = sc.nextFloat();

        System.out.println("Enter the marks for m4: ");
        m4 = sc.nextFloat();

        System.out.println("Enter the marks for m5: ");
        m5 = sc.nextFloat();

        sc.close();

        total = m1 + m2 + m3 + m4 + m5;

        float percentage = ((total) * 100) / 250;

        System.out.println("The percentage of the student is: " + percentage + " %");

    }
}
