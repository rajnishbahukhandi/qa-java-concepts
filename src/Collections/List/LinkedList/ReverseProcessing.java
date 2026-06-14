package Collections.List.LinkedList;

import java.util.LinkedList;
//Data processing on output in reverse order.
public class ReverseProcessing {
    public static void main(String [] args){
        LinkedList<String> api=new LinkedList<>();
        api.add("/login");
        api.add("/search");
        api.add("/booking");
        api.add("/payment");
        while (!api.isEmpty()){
            System.out.println(api.removeLast());
        }
    }
}
