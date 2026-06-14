package Collections.Set.HashSet;

import java.util.HashSet;

public class CompareExpectedvsActualAPIs {
    public static void main(String[] args){
        HashSet<String> expected = new HashSet<>();
        expected.add("login");
        expected.add("search");
        expected.add("booking");

        HashSet<String> actual = new HashSet<>();
        actual.add("login");
        actual.add("booking");

        for(String api:expected){
            if(actual.contains(api)){
                System.out.println(api + ": pass");
            }else{System.out.println(api+ ": fail");}
        }
    }
}
