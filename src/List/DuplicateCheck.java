package List;

import java.util.ArrayList;
// remove duplicate logic
public class DuplicateCheck {
    public static void main (String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Ravi");
        names.add("Amit");

        ArrayList<String> unique = new ArrayList<>();
        // Create empty list: unique
        for(String n : names){
            // Remove Duplicate (using contains) : Add only if value does NOT already exist.
            if(unique.contains(n)!=true){
            // if(unique.contains(n)=false){
            // if(!unique.contains(n)){
                unique.add(n);
            }
        }
        System.out.println(unique);
    }
}
