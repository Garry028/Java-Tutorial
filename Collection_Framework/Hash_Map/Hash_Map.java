
import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        // One object is used as a key (index) to another object (value). It can store
        // different types: String keys and Integer values, or the same type, like:
        // String keys and String values:
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // System.out.println(capitalCities);

        // To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(capitalCities.get("England"));

        // To remove an item, use the remove() method and refer to the key:
        capitalCities.remove("England");

        System.out.println(capitalCities);

        // To remove all items, use the clear() method:
        // capitalCities.clear();

        // To find out how many items there are, use the size() method:

        capitalCities.size();

        // Use the keySet() method if you only want the keys, and use the values()
        // method if you only want the values:

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
         
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i +" --> " + " value: " + capitalCities.get(i));
          }
    }
}
