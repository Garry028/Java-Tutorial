package File_Handling.Read_String;
import java.io.*;
import java.util.*;

public class Read_String_of_10_char
{
    public static void main(String[] args) {
        System.out.println("Enter a string of 10 char");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray(); // this will convert string into char array
        CharArrayReader chr = new CharArrayReader(c);
        int i;
        System.out.println("Displaying the string using CharArrayReader ");
        try {
            while((i=chr.read())!=-1)
            {
                System.out.println((char)i);
            }
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        System.out.println("Displaying substring");
        CharArrayWriter caw =new CharArrayWriter();
        caw.write(str,2,5);
        System.out.println(caw.toString());
        sc.close();
    }
}