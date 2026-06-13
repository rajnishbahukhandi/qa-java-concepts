package Collections.Set;

import java.util.HashSet;

public class UniquecodesAndTotalUniquecount {
    public static void main(String [] args){
        HashSet<Integer>response=new HashSet<>();
        response.add(200);
        response.add(200);
        response.add(201);
        response.add(404);
        response.add(500);
        response.add(500);

        System.out.println("UniqueCode: "+ response);

        System.out.println("TotalUniqueCount: "+response.size());
    }
}
