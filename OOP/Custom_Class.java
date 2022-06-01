package OOP;

import java.util.Scanner;

class Employee // in a java programm only one public class is there
{
    int id;
    String name;

    Employee()  // this is constructor
    {
        id=-1;
        name=" ";
    }

    public void getdata()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of Employee");
        name = sc.nextLine();

        System.out.println("Enter the id of Employee");
        id = sc.nextInt();

        sc.close();

    }

    public void showdata()
    {

      System.out.println("The id of employee is: "+ id);
      System.out.println("The name of the empolyee is: "+ name);

    }
}

public class Custom_Class 
{
    public static void main(String[] args) 
    {

        System.out.println("This is our custom class ");
        Employee garry = new Employee();// object creation of the employee class
        garry.getdata();
        garry.showdata();

    }
}