package File_Handling.Buffer_String_Reading_and_Writing;

import java.io.*;

public class Buffer_String_Reading_and_Writing {
    public static void main(String[] args) {
        // using Buffered Writer class
        
          try {
          FileWriter writer=new FileWriter("output.txt");
          BufferedWriter buffer=new BufferedWriter(writer);
          String str="Hello garry how are you ? , It's been a while right  ?, ok but i'll have to go";
          buffer.write(str);
          buffer.close();
          writer.close();
          System.out.println("Written data in the file");
          } catch (Exception e) {
          e.printStackTrace();
          }
         

        /*
         * using String Writer class
         * 
         *  try {
         *  FileWriter fw = new FileWriter("output.txt");
         *  StringWriter sw = new StringWriter();
         *  sw.write("Hello garry how are you ? , Hishashi buri dana Mugiwara !?");
         *  sw.write(sw.toString());
         *  sw.close();
         *  fw.close();
         *  System.out.println("Written data in the file");
         * 
         *  } catch (Exception e) {
         *  e.printStackTrace();
         * }
         */

       
         // using Buffered Reader class
         /* 
         try {
            FileReader reader = new FileReader("output.txt");
            BufferedReader buffer = new BufferedReader(reader);
            int i;
            System.out.println("The contents of the file are..");
            try {
                while((i=buffer.read())!=-1)
                {
                    System.out.println((char)i);
                }
                buffer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */

        // Using String Reader
     /* 
        String str="Hello garry how are you ?";
        StringReader reader= new StringReader(str);
        char buff[]=new char[50];
        try {
            reader.read(buff,0,str.length());
            System.out.println(buff);
            reader.close();
        } catch (Exception e) {
        }
     */
    }
}
