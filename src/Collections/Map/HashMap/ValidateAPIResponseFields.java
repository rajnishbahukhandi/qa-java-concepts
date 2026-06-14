package Collections.Map.HashMap;

import java.util.HashMap;
//Verify mandatory response fields exist.
//validation
//API field checking
public class ValidateAPIResponseFields {
    public static void main(String [] args){
        HashMap<String,Object> response = new HashMap<>();
        //because Object is the parent class of almost everything in Java.
        response.put("status",200);
        response.put("message","successfull");
        response.put("user","raj");
        response.put("active",true);
        response.put("salary",70000.88);

        String[] mandatory = {"status","message","user","active","salary","Office"};
        // Array of String. Verify mandatory response fields exist.
        for(String lables : mandatory){
            if (response.containsKey(lables)){
                System.out.println(lables + ": " + "verified");
            }
            else{
                System.out.println(lables + ": " + "not verified");
            }
        }
    }
}
