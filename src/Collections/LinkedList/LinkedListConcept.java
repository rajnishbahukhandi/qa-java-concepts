package Collections.LinkedList;

import java.util.LinkedList;
//LinkedList is a java collection class that stores elements in sequence where each element is connected
//next element.
public class LinkedListConcept {
    public static void main(String [] args){
        LinkedList<String>names=new LinkedList<>();
        //add()
        names.add("Raj");
        names.add("vijay");
        names.add("amit");
        names.add("Raj");
        System.out.println(names);

        //get()
        System.out.println("get: "+names.get(2));

        //getFirst()
        System.out.println("getFirst: "+names.getFirst());

        //remove()
        System.out.println("remove: "+names.remove(3));

        //removeLast()
        System.out.println("removeLast: "+names.removeLast());
    }
}
