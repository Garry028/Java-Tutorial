package String_Methods;
public class String_Methods {
    public static void main(String[] args) {
        String a1 = "Garry";
        String a2 = new String("Harry");
        System.out.println(a1.toUpperCase()); // returns string in the uppercase
        System.out.println(a1.toLowerCase());
        System.out.println(a2.length());// returns the length of the string
 
        String nontrimmedString="  Harry   ";
        System.out.println(nontrimmedString);
        System.out.println(nontrimmedString.trim()); // removes leading and trailing spaces

        System.out.println(a1.substring(3)); // subtring that starts from the index 3 in " Garry "
        System.out.println(a1.substring(1,4));//start is included but the end is not included
       
        System.out.println(a1.replace('y', 'e'));
        System.out.println(a1.replace("Garry", "Barry"));
         
        System.out.println(a1.charAt(1));
        System.out.println(a1.equals("Garry"));
        System.out.println(a1.compareToIgnoreCase("Garry"));


    }
}
