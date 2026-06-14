package Collections.List.LinkedList;

import java.util.LinkedList;
//Nested loop comparison: Compare every endpoint with remaining endpoints to find duplicates.
//This logic appears in: duplicate validation, data comparison, response verification.
//It only reads existing LinkedList values using indexes and compares them.
public class DetectDuplicateEndpoints {
    public static void main(String [] args){
        LinkedList<String>endpoint=new LinkedList<>();
        endpoint.add("/login");
        endpoint.add("/search");
        endpoint.add("/booking");
        endpoint.add("/login");
        endpoint.add("/booking");

        for (int i=0;i<endpoint.size();i++){
            for (int j=i+1;j<endpoint.size();j++){
                if(endpoint.get(i).equals(endpoint.get(j))){
                    System.out.println("Duplicate: "+endpoint.get(i));
                }
            }
        }
    }
}
