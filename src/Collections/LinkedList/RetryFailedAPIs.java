package Collections.LinkedList;

import java.util.LinkedList;

public class RetryFailedAPIs {
    public static void main(String [] args){
        LinkedList<Integer>status=new LinkedList<>();
        status.add(200);
        status.add(500);
        status.add(404);
        status.add(201);
        LinkedList<Integer>failedCode=new LinkedList<>();
        while (!status.isEmpty()){
            int code = status.removeFirst();
            if(code>400){
                failedCode.add(code);
            }
        }
        System.out.println("Retry failed APIs: "+failedCode);
    }
}
