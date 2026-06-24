package StringBuilder;

public class Append {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" "+"world");
        System.out.println(sb);
    }
}

// StringBuilder_inJava class used to create and modify strings in Java. It is mutable, meaning that it can be changed after it is created. The StringBuilder class provides various methods to manipulate strings, such as append(), insert(), delete(), reverse(), and more. It is more efficient than using regular String concatenation when dealing with large or frequently modified strings.
// StringBuilder_allows changing text inside the same object.