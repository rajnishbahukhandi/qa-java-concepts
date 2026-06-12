package Collections.Map;

import java.util.HashMap;
//compare responses
//assertion style logic
public class CompareExpectedvsActualAPIResponse {
    public static void main(String [] args){
        HashMap<String,Object> expected = new HashMap<>();
        expected.put("status",200);
        expected.put("user","Raj");
        expected.put("active",true);

        HashMap<String,Object> actual = new HashMap<>();
        actual.put("status",200);
        actual.put("user","Rajnish");

        for(String keys : expected.keySet()){
            // keySet() : return all keys
            // get() : get value (API Method)
            if(expected.get(keys).equals(actual.get(keys))){
                System.out.println(keys + ": " + "pass");
            }
            else{
                System.out.println(keys + ": " + "fail");
            }
        }
    }
}
