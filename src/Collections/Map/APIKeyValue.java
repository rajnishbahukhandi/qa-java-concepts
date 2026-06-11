package Collections.Map;

import java.util.HashMap;

public class APIKeyValue {
    public static void main(String [] args){
        HashMap<String,String> response = new HashMap<>();
        response.put("Success OK", "200");
        response.put("Created", "201");
        response.put("No Content","204");
        response.put("Redirect","303");
        response.put("Bad Request","404");
        response.put("Unauthorized","401");
        response.put("Forbidden","403");
        response.put("Not Found","404");
        response.put("Too Many Requests","429");
        response.put("Internal Server Error","500");
        response.put("Bad Gateway","502");

        for (String keyapi : response.keySet()) {
            System.out.println(keyapi + " : " +response.get(keyapi));
        }
    }
}
