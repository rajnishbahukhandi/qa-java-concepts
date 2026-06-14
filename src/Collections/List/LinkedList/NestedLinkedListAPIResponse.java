package Collections.List.LinkedList;

import java.util.LinkedList;

public class NestedLinkedListAPIResponse {
    public static void main(String[] args) {
        LinkedList<Object> response = new LinkedList<>();
        response.add(200);
        response.add("Success");

        LinkedList<String> users = new LinkedList<>();
        users.add("Raj");
        users.add("Amit");

        response.add(users);
        System.out.println(response);
    }
}
