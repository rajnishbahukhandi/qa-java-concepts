package List;

import java.util.ArrayList;
// validation logic
public class ValidateAPIStatusCodes {
    public static void main(String [] args){
        ArrayList<Integer> statuscode = new ArrayList<>();
        statuscode.add(200);
        statuscode.add(201);
        statuscode.add(204);
        statuscode.add(400);
        statuscode.add(403);
        statuscode.add(500);

        for (Integer code : statuscode){
            if(code >= 400){
                System.out.println("API FAIL : " + code);
            }

        }
    }
}
