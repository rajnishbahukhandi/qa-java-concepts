package StringBuilder;

public class Delete {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(2,4);
        System.out.println(sb);
    }
}
