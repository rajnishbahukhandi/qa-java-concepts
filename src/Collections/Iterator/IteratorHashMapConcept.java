package Collections.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorHashMapConcept {
    public static void main(String[] args){
        HashMap<String,Integer>api = new HashMap<>();
        api.put("login",200);
        api.put("page not found",404);
        Iterator<Map.Entry<String,Integer>>it= api.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
