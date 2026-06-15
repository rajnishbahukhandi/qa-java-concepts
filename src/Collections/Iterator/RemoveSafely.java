package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveSafely {
    public static void main(String [] args){
        ArrayList<Integer>codes = new ArrayList<>();
        codes.add(200);
        codes.add(201);
        codes.add(204);
        codes.add(404);
        codes.add(500);
        Iterator<Integer>it = codes.iterator();
        while(it.hasNext()){
            int code = it.next();
            if(code>400){
                it.remove();
                System.out.println("Remove Safely: "+code);
            }
        }
        System.out.println("Success code: "+codes);
    }
}
