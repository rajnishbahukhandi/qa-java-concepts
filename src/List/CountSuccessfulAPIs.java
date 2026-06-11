package List;

import java.util.ArrayList;
// validation logic
public class CountSuccessfulAPIs {
    public static void main(String [] args){
        ArrayList<Integer> statuscode = new ArrayList<>();
        statuscode.add(200);
        statuscode.add(201);
        statuscode.add(204);
        statuscode.add(400);
        statuscode.add(403);
        statuscode.add(500);

        int successcount = 0;
        for (int code : statuscode){
            if(code<400){
                successcount++;
            }
        }
        System.out.println("API SUCCESSFUL : "+ successcount);
    }
}
