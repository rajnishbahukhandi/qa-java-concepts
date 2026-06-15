package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
//iterator is an Interface used to read and traverse collection elements one by one.
public class APIStatusCode {
    public static void main(String [] args){
        ArrayList<Integer>codes = new ArrayList<>();
        codes.add(200);
        codes.add(404);
        codes.add(500);
        Iterator<Integer>it = codes.iterator();
        while(it.hasNext()){
            int code = it.next();
            System.out.println(code);
        }
    }
}
