package Collections.List.LinkedList;

import java.util.LinkedList;
//Data store in LinkedList in reverse order.
public class ReverseDataStore {
    public static void main(String [] args){
        LinkedList<String>api=new LinkedList<>();
        api.add("/login");
        api.add("/search");
        api.add("/booking");
        api.add("/payment");
        LinkedList<String>reverseStoreapi=new LinkedList<>();
        while (!api.isEmpty()){
            reverseStoreapi.add(api.removeLast());
        }
        System.out.println(reverseStoreapi);
    }
}
