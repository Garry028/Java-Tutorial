package OOP.Constructors;

import java.util.Scanner;

class Employee // in a java programm only one public class is there
{
    int id;
    String name;

    public Employee() // this is constructor
    {
        id = 0;
        name = "";
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Employee(int ID, String NAME) {
    //    id=ID;
    //    name=NAME;
    // }

    public void getdata() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of Employee");
        name = sc.nextLine();

        System.out.println("Enter the id of Employee");
        id = sc.nextInt();

        sc.close();

    }

    public void showdata() {

        System.out.println("The id of employee is: " + id);
        System.out.println("The name of the empolyee is: " + name);

    }
}

public class Constructors {
    public static void main(String[] args) {
        // Employee garry = new Employee(12,"Gaurav");
        Employee garry = new Employee();

        // garry.getdata();
        garry.showdata();
    }
}
