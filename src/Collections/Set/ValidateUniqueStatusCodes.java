package Collections.Set;

import java.util.HashSet;

public class ValidateUniqueStatusCodes {
    public static void main(String [] args){
        int[] codes = {200,201,204,201,404,404,500};
        HashSet<Integer>unique=new HashSet<>();
        for(int code : codes){
            unique.add(code);
        }
        System.out.println("counts: "+unique.size());
        System.out.println("unique codes: "+unique);
    }
}
