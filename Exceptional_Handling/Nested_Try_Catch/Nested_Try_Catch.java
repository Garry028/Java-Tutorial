package Exceptional_Handling.Nested_Try_Catch;
import java.util.*;;
public class Nested_Try_Catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){

        try
        {

            int [] marks =new int[5];

            System.out.println("Enter the marks of students: ");

            for (int i = 0; i < 5; i++) {
                
              marks[i]=sc.nextInt();
                
            }
            System.out.print("The array is: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(marks[i] + " ");
            }
            System.out.println("\n");

           try
           {
               int j;
               System.out.println("Enter the index: ");
               j=sc.nextInt();
               System.out.println("The value at index 6 is: "+ marks[j]);

           }
           catch(ArrayIndexOutOfBoundsException e)
           {
               System.out.println("Can't Access That Element , Array Index Out Of Bounds Exception");
           }

        }
        catch( ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception outer");

        }
      
        System.out.println("Do you want to continue ?");
        String flag2=sc.next();
        sc.close();
        if(flag2=="no")
        {
            flag=false;
        }
        
    }
}

}
