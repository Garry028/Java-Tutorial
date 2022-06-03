package Switch;

import java.util.Scanner;

class Operations {

    public void Addition(int num1, int num2) {
        
        
        int result;
        result = num1 + num2;
        System.out.println("The addition is: " + result);
    }

    public void Subtraction(int num1, int num2) {
        int result;
        result = num1 - num2;
        System.out.println("The Subtraction is: " + result);

    }

    public void Multiplication(int num1, int num2) {

        int result;
        result = num1 * num2;
        System.out.println("The Multiplication is: " + result);
    }

    public void Division(int num1, int num2) {
        try {
            int result;
            result = num1 / num2;
            System.out.println("The Division is: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Division by zero !!!");
            e.printStackTrace();
        }

    }
}

public class Question {
    public static void main(String[] args) {
        Operations op = new Operations();
        int choice, n1, n2;
        boolean flag = true;
        System.out.println("\nWelcome to Operations.........\n");
        while (flag) {
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
            System.out.println("What do you want to do ?");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers: ");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    op.Addition(n1, n2);
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    op.Subtraction(n1, n2);
                    break;
                case 3:
                    System.out.println("Enter two numbers: ");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    op.Multiplication(n1, n2);
                    break;
                case 4:
                    System.out.println("Enter two numbers: ");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    op.Division(n1, n2);
                    break;
                default:
                    break;
            }
            String flag2;
            System.out.println("Do you want to continue ?");
            flag2 = sc.next();
            sc.close();

            if (flag2 == "no") {
                flag = false;
            }
        }

    }
}
