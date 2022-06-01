package Literals;
import  java.util.Scanner;;

public class Literals {
    public static void main(String[] args) {
        // byte age=100;
        // char ch='G';
        // float f1=8.2f; //in float we've to attach f in end
        // double d1=2.222d;
        // long number=9112738470l;
        // short age_1=9290;
        // boolean b= true;
        // String s="Garry";
        // System.out.println(s);
        // System.out.println(b);
        // System.out.println(age);
        // System.out.println(ch);
        // System.out.println(f1);
        // System.out.println(d1);
        // System.out.println(number);
        // System.out.println(age_1);

        System.out.println("Taking input from user: ");
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter First Number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter Second Number: ");
        // int num2 = sc.nextInt();
        // int sum =num1+num2;
        // System.out.println("The sum of num1 & num2 is: " + sum);

        // System.out.println("Enter the string : ");
        // String s1 =sc.nextLine();//it reads whole line including the whitespace
        // String s1 =sc.next();  // it reads only a word


        // System.out.println("The string is: "+ s1);

        boolean b1 = sc.hasNextInt();  // if the integer input comes then true else false
        System.out.println(b1);
        sc.close();







    }
}
