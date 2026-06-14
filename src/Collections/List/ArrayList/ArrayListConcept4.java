package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListConcept4 {
    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Rajnish");
        names.add("Ravi");
        names.add("Amit");
        names.add("Sandeep");
        // Add and print
        System.out.println("listing: "+ names);
        // Get value by Index
        System.out.println("Index: "+ names.get(2));
        System.out.println("First: "+ names.getFirst());
        System.out.println("Last: "+ names.getLast());
        // Update value
        names.set(0,"Vijay");
        System.out.println("Update: "+names);
        // Remove Element
        names.remove(1);
        System.out.println("Remove: " + names);
        // Check contains
        System.out.println("Contains: "+ names.contains("Vijay"));
        System.out.println("Contains: "+ names.contains("vijay"));
        // Size
        System.out.println("Size: "+ names.size());
        names.add("Sumit");
        names.add("Vikram");
        names.add("Ravi");
        // Remove Duplicate (using contains)
        System.out.println("Duplicate Remove: " + names.contains("Ravi"));
        System.out.println("Duplicate Remove: " + names.contains("Ammy"));
        // Check Empty
        System.out.println("Empty: " + names.isEmpty());
        names.add("");
        names.add(null);
        // expect "" and null to mean empty, but ArrayList counts them as elements.
        System.out.println("Empty: " + names.isEmpty());
        System.out.println(names);






    }
}
