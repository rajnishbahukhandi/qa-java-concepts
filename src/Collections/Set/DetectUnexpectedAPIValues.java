package Collections.Set;

import java.util.HashSet;
//Success Count
//Failed Count
//Duplicate Codes
public class DetectUnexpectedAPIValues {
    public static void main(String[] args){
        int[] codes = {200, 201, 404 ,404 ,500 ,503 ,503};
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> success = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        HashSet<Integer> failed = new HashSet<>();
        for(int api : codes){
            if(!unique.add(api)){
                duplicate.add(api);
            } else if(api>=400){
                failed.add(api);
            } else if (api<400) {
                success.add(api);
            }
        }
        System.out.println("Success Count: "+success.size());
        System.out.println("Failed Count: "+failed.size());
        System.out.println("Duplicate Codes: "+duplicate);
    }
}
