package Collections.List.LinkedList;

import java.util.LinkedList;

public class ValidateAPIExecutionOrder {
    public static void main(String[] args) {

        LinkedList<String> expected = new LinkedList<>();
        expected.add("login");
        expected.add("search");
        expected.add("payment");

        LinkedList<String> actual = new LinkedList<>();
        actual.add("login");
        actual.add("payment");
        actual.add("search");

        for (int i=0; i<expected.size();i++){
            if(expected.get(i).equals(actual.get(i))){
                System.out.println("pass: "+actual.get(i));
            }else {System.out.println("fail: "+actual.get(i));
            }
        }
    }
}
