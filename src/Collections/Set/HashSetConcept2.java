package Collections.Set;

import java.util.HashSet;
//Case 4 — Cast manually✅ part2
//Check type before casting
//use instanceof, if force to Integer.
//Similar with String and other.
//Primitive types in patterns, instanceof and switch are not supported at language level '21'
//APIDuplicateValidation example part1
public class HashSetConcept2 {
    public static void main(String [] args){
        HashSet<Object> response = new HashSet<>();
        response.add(200);
        response.add(200);
        response.add(201);
        response.add(400);
        response.add(500);
        response.add(400);

        //HashSet<Object> → use Object in loop
        //Because: response stores Object ----> loop variable should accept Object
        for (Object n : response){
            //Check type before casting: use instanceof, if force to Integer.
            //Otherwise, ClassCaseException runtime error will rise.
            if(n instanceof Integer) {
                //casting
                Integer value = (Integer) n;
                System.out.println(value);
            }
        }
    }
}
