package Collections.Map;

import java.util.HashMap;
// HashMap is a class in java that stores data in the form of keys-value pairs, where each key is unique
// and used to access its corresponding value efficiently.
// Map belongs to collections framework but is not a child of collection interface.
public class HashMapConcept {
    public static void main(String[] args){
        HashMap<String,String> user = new HashMap<>();
        //Add Data → put()
        user.put("name","Rajnish");
        user.put("city","Gurgaon");
        user.put("company", "IT");
        user.put("email","rajnishbahukhandi@gmail.com");
        System.out.println(user);

        //Get Value → get()
        System.out.println("Get value: "+user.get("company"));

        //Update value
        user.put("phone","99********");
        System.out.println("Update value: "+user);

        //Remove
        user.remove("email");
        System.out.println("Remove value: "+ user);

        //Check keys
        System.out.println("Check keys: " + user.containsValue("company"));
        System.out.println("Check keys: " + user.containsValue("IT"));

        //Check value
        System.out.println("Check value: " + user.containsValue("name"));
        System.out.println("Check value: " + user.containsValue("Rajnish"));

        //Return all keys from HashMap - keySet()
        System.out.println("Return all keys: " + user.keySet());

        //size()
        System.out.println(user.size());
    }

}
