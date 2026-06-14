package Collections.Set.HashSet;

import java.util.HashSet;

public class FindDuplicateResponses {
    public static void main(String[] args){
        String[] response = {"Raj", "Amit", "Raj", "Vijay", "Amit"};
        HashSet<String> unique = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();
        for(String userapi : response){
            if(!unique.add(userapi)){
                duplicate.add(userapi);
            }
        }
        System.out.println("Unique response: "+unique);
        System.out.println("Duplicate response: "+duplicate);
    }
}
