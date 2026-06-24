package StringBuilder;

public class toString {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Developer");
        String s = sb.toString();
        System.out.println(s);
    }
}
// append() changed the builder, and toString() converted it into a normal String.