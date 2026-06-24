package Coding.StringQuestions;

public class ReverseString {
    public static void main(String [] args) {
        String word = "MILTON";
        String reverseString = "";
        int length = word.length();
        while(length>0) {
            // iterate from the last character down to the first
            reverseString = reverseString + word.charAt(length - 1);
            length--;
        }
        // print the final reversed string
        System.out.println("Reverse of the string is: " + reverseString);
    }
}
