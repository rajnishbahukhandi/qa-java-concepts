package Collections.List.ArrayList;

import java.util.ArrayList;
//Multiple arraylists
//Index matching
public class FindFailedAPIs {
    public static void main(String [] args){
        ArrayList<String> api = new ArrayList<>();
        api.add("Login");
        api.add("Search");
        api.add("Booking");

        ArrayList<Boolean> result = new ArrayList<>();
        result.add(true);
        result.add(false);
        result.add(true);

        for (int i=0;i<api.size();i++){
            // Execute only when value is false
            if(result.get(i)==false){
//            if(!result.get(i)){
                System.out.println(api.get(i) + " Failed");
            }
        }
    }
}
