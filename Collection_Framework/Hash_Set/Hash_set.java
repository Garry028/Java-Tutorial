import java.util.*;
public class Hash_set {
 public static void main(String[] args) {
    // A HashSet is a collection of items where every item is unique

    HashSet <String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    // cars.add("Mazda"); // duplicates are not allowed

    // To check whether an item exists in a HashSet, use the contains() method:

    System.out.println(cars.contains("Mazda"));
    
    System.out.println(cars);

    // To remove an item, use the remove() method:
    cars.remove("Volvo");

    // To remove all items, use the clear() method:
    cars.clear();
 }   
}
