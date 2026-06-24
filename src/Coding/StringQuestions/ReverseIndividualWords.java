package Coding.StringQuestions;

public class ReverseIndividualWords {
    public static void main(String [] args) {
        String sentence = "Java Developer";
        String [] word = sentence.split(" ");
        String reverseSentence= "";
        for(String words : word){
            StringBuilder sb = new StringBuilder(words);
            sb.reverse();
            reverseSentence += sb.toString() + " ";
        }
        System.out.println(reverseSentence.trim());
    }
}
