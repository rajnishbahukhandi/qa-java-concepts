package Collections.Set;

import java.util.HashSet;
//HashSet is a Java collection class that stores unique elements and automatically prevents duplicate values.
public class HashSetConcept {
    public static void main(String [] args){
        HashSet<String> names = new HashSet<>();
        //Basic add()
        //Duplicate Remove(): duplicate behavior / HashSet is used to store data where duplicate values are not allowed.
        names.add("Raj");
        names.add("Amit");
        names.add("Vijay");
        names.add("Raj");
        names.add("amit");
        System.out.println(names);

        //contains(): value exists
        System.out.println("Contains: "+names.contains("Raj"));
        System.out.println("Contains: "+names.contains("Rajnish"));

        //Size()
        System.out.println("Size: "+names.size());

        //isEmpty()
        System.out.println("isEmpty: "+names.isEmpty());

        //clear()
        names.clear();
        System.out.println("clear: "+names);

    }
}
