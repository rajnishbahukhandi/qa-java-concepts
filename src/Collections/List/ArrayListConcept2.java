package Collections.List;

import java.util.ArrayList;
// Integer ArrayList
public class ArrayListConcept2 {
    public static void main(String [] args){
        ArrayList<Integer> id = new ArrayList<>();
        id.add(101);
        id.add(102);
        id.add(103);
        id.add(104);
        id.add(105);

        for(Integer ids : id){
            System.out.println(ids);
        }
    }
}
