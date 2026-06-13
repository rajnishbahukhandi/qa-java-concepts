package Collections.Set;

import java.util.HashSet;
//Find failed APIs also remove duplicates.
public class FindFailedAPIsOnly {
    public static void main(String[] args){
        int[] status = {200,201,204,402,400,400,401,500,401};
        HashSet<Integer>failed=new HashSet<>();
        for (int code : status){
            if(code>=400){
                failed.add(code);
            }
        }
        System.out.println(failed);
    }
}
