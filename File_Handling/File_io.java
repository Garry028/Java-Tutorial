package File_Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class File_io {
    public static void main(String[] args) {


        // like this we can create a file

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of file: ");
        String filename=sc.nextLine();
        sc.close();

        File myfFile = new File(filename);// her create an object of stream

        try {
            myfFile.createNewFile(); // successfully created file
        } catch (IOException e) {
            System.out.println("Unable to create this file !!!");
            e.printStackTrace();
        }
        


       // like this we can write to a file
      
    //    try {
    //         FileWriter fileWriter = new FileWriter(filename);
    //         fileWriter.write("This is our first file in java\nOkay you know the things about java");
    //         fileWriter.close();
    //     } catch (IOException e) {
    //         System.out.println("Unable to read the file !!!");
    //         e.printStackTrace();
    //     }
     

       // like this we can read from the file
      
    //    File myfFile = new File(filename);
    //    try {
    //     Scanner sc= new Scanner(myfFile);
    //     while(sc.hasNextLine())
    //     {
    //         String line=sc.nextLine();
    //         System.out.println(line);
    //     }
    //     sc.close();
    // } catch (FileNotFoundException e) {
    //     e.printStackTrace();
    // }
     

     // like this we can delete a file

    //  File myfFile = new File(filename);
    //  if(myfFile.delete())
    //  {
    //      System.out.println("I have deleted: " + myfFile.getName());
    //  }
    //  else
    //  {
    //      System.out.println("Some error has occurred while deleting file ");
    //  }

    }
}
