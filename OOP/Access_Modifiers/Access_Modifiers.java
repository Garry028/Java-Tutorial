package OOP.Access_Modifiers;
import java.util.Scanner;
class myEmployee
{
    // Private: The code is only accessible within the declared class
    private int id;
    private String name;
    
    myEmployee()
    {
        id=0;
        name="";
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


public class Access_Modifiers
{
    public static void main(String[] args) {
        myEmployee garry=new myEmployee();
        garry.getdata();
        garry.showdata();
    }
}

