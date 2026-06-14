package Collections.List.LinkedList;

import java.util.LinkedList;
// Add in middle and any position with index value.
public class AddInMiddleLinkedListStrength {
    public static void main(String [] args){
        LinkedList<String>response=new LinkedList<>();
        response.add("Login");
        response.add("search");
        response.add("redirect to processing items");
        response.add("checkout");

        response.add(2,"add to cart");
        System.out.println(response);

        response.add(5,"payment");
        System.out.println(response);
    }
}
