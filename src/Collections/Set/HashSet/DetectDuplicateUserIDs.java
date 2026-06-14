package Collections.Set.HashSet;

import java.util.HashSet;
//This pattern (if(!set.add(value))) is a common Java interview question for duplicate detection.
//store duplicate IDs in a list.
public class DetectDuplicateUserIDs {
    public static void main(String [] args){
        HashSet<String>users=new HashSet<>();
        HashSet<String>duplicateid=new HashSet<>();
        String[] response = {"U101","U102","U103","U104","U103","U102"};
        for(String id : response){
            if(users.add(id)==false){
                duplicateid.add(id);
            }
        }
        System.out.println("Detect Duplicate: "+duplicateid);
        System.out.println("User id: "+ users);
    }
}
