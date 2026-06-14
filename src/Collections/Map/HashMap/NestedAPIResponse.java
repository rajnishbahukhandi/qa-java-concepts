package Collections.Map.HashMap;
import java.util.HashMap;
//Nested JSON
public class NestedAPIResponse {
    public static void main(String [] args){
        HashMap<String,Object> user = new HashMap<>();
        user.put("name","Rajnish");
        user.put("country","Gurgaon");

        HashMap<String,Object> response = new HashMap<>();
        response.put("user",user);

        System.out.println(response);

        //Store the HashMap object returned by response.get("user")
        //into the variable data after casting it to HashMap<String,Object>.
        HashMap<String,Object> data = (HashMap<String,Object>)response.get("user");
        System.out.println("Get the country: "+ data.get("country"));
    }
}
