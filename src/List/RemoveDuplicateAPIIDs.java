package List;

import java.util.ArrayList;
//contains
//remove duplicate logic
public class RemoveDuplicateAPIIDs {
    public static void main(String [] args){
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(101);
        ids.add(102);
        ids.add(101);

        ArrayList<Integer> uniqueId = new ArrayList<>();
        for (Integer id : ids){
            if(uniqueId.contains(id) == false){
                uniqueId.add(id);
            }
        }
        System.out.println(uniqueId);
    }
}
