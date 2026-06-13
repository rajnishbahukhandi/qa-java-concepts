package Set;

import java.util.ArrayList;
import java.util.HashSet;
//ArrayList accept duplicates while HashSet remove duplicates.
public class CompareArrayListvsHashSet {
    public static void main(String [] args){
        ArrayList<String>names = new ArrayList<>();
        names.add("raj");
        names.add("raj");
        System.out.println("ArrayList: "+names);

        HashSet<String>employee = new HashSet<>();
        employee.add("raj");
        employee.add("raj");
        System.out.println("HashSet: "+employee);
    }
}
