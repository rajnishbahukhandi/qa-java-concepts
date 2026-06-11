package Collections.List;

import java.util.ArrayList;
// ArrayList
public class ArraylistConcept3 {
    public static void main(String [] args){
        ArrayList<Boolean> flag = new ArrayList<>();
        flag.add(true);
        flag.add(false);
        flag.add(false);
        flag.add(true);
        flag.add(true);

        for (Boolean flags : flag){
            System.out.println(flags);
        }

        ArrayList<Float> salary = new ArrayList<>();
        salary.add(50.5f);
        salary.add(60.7f);
        salary.add(100.90f);
        for(float salarys : salary){
            System.out.println(salarys);
        }

        ArrayList<Double> price = new ArrayList<>();
        price.add(100.5);
        price.add(505.90);
        price.add(1098.88);
        for (double prices : price){
            System.out.println(prices);
        }
    }
}
