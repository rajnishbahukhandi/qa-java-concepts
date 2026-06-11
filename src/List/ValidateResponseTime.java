package List;

import java.util.ArrayList;
//validation logic
public class ValidateResponseTime {
    public static void main(String [] args){
        ArrayList<Integer> time = new ArrayList<>();
        time.add(500);
        time.add(1200);
        time.add(1500);
        time.add(2000);
        time.add(3000);
        time.add(5000);

        for (int validateTime : time){
            if(validateTime > 2000)
                System.out.println("Slow API : " + validateTime);
        }
    }
}
