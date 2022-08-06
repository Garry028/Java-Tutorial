package Collection_Framework.Array_List_tuts;
import java.util.*;
public class Array_list
{
    public static void main(String[] args) {


        // Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

        // ArrayList<Integer> mynum = new ArrayList<Integer>();
        // ArrayList<Boolean> mybool = new ArrayList<Boolean>();
        // ArrayList<Character> mychar = new ArrayList<Character>();


        // this is just like the vector
    ArrayList <String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Swift");

        // To access an element in the ArrayList, use the get() method and refer to the index number:

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        

        // To modify an element, use the set() method and refer to the index number:

        cars.set(1, "Nano");
         
        // To remove an element, use the remove() method and refer to the index number:

        cars.remove(0);

        // To remove all the elements in the ArrayList, use the clear() method:
        // cars.clear();

        // To find out how many elements an ArrayList have, use the size method:

        System.out.println(cars.size());
        // loop through the ArrayList

        // for(int i=0;i<cars.size();i++) 
        // {
        //     System.out.println(cars.get(i));
        // }
      

         // forEach loop
         for (String i : cars) {
            System.out.println(i);
         }


        // System.out.println(cars);



        // Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

        Collections.sort(cars);
        System.out.println("Sorted Array is: "+cars);
    }
}