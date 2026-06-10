package List;

import java.util.ArrayList;
// ArrayList
public class ArraylistConcept {
    public static void main (String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Rajnish");
        names.add("Ravi");
        names.add("Hari");
        names.add("Dev");

        for(String n : names){
            System.out.println(n);
        }
    }
}
