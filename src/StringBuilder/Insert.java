package StringBuilder;

public class Insert {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Developer");
        //insert at position start 0.
        sb.insert(0, "Java ");
        System.out.println(sb);
        //To verify the length before new insert word.
        System.out.println(sb.length());
        // insert at position end 14.
        sb.insert(14, " Engineer");
        System.out.println(sb);
    }
}
