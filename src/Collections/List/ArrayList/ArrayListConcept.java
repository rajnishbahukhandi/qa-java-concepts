package Collections.List.ArrayList;

import java.util.ArrayList;
// arraylist: is a class in java use to store multiple values in dynamic array.
// Size can grow automatically and shrink automatically.
// Expand and can add more.
// String arraylist
public class ArrayListConcept {
    public static void main (String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Rajnish");
        names.add("Ravi");
        names.add("Hari");
        names.add("Dev");

        // Loop Through arraylisting
        for(String n : names){
            System.out.println(n);
        }
    }
}
