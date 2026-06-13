package Collections.Map;

import java.util.HashMap;
//Pass only success codes.
public class ValidateStatusCodeRange {
    public static void main(String [] args){
        HashMap<String,Object> api = new HashMap<>();
        api.put("login", 200);
        api.put("search",201);
        api.put("filter option",201);
        api.put("Booking",200);
        api.put("payment",500);

        for(String endpoint : api.keySet()){
            // because values are Object. returns keys, not values.
            int code = (Integer)api.get(endpoint);
            if(code>=200 && code<=300){
                System.out.println(code + ": " + "pass");
            }
            else{
                System.out.println(code + ": " + "fail");
            }
        }
    }
}
