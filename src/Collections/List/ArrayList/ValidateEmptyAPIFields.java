package Collections.List.ArrayList;

import java.util.ArrayList;
//null handling
//empty check
//validation logic
public class ValidateEmptyAPIFields {
    public static void main(String[] args){
        ArrayList<String> users = new ArrayList<>();
        users.add("Raj");
        users.add("");
        users.add("null");
        users.add("Rajnish");

        for (String u : users){
            if(u == null || u.isEmpty()){
                System.out.println("Invalid data ");
            }
        }
    }
}
