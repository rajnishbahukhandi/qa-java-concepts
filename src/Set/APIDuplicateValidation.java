package Set;
import java.util.HashSet;
//API Duplicate Validation
//Case 1 — HashSet<Object> → use Object in loop ✅ Object parent class, Object store multiple object types.
//Case 2 — Use String ❌ Because: response may contain: Integer,Boolean,Double
//Case 3 — Use Integer ❌ Because: response may contain: String,Boolean,Double
//Case 4 — Cast manually✅ Applied on HashSetConcept2
//Type should match collection generic type (or compatible parent type).
public class APIDuplicateValidation {
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
            System.out.println(n);
        }

    }
}
