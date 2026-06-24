package Coding.StringQuestions;

public class ReverseIndividualWords {
    public static void main(String [] args) {
        String sentence = "Java Developer";
        String [] word = sentence.split(" ");
        String reverseSentence= "";
        for(int i = 0; i < word.length; i++){
            StringBuilder sb = new StringBuilder(word[i]);
            sb.reverse();
            if(i > 0){
                reverseSentence += " ";
            }
            reverseSentence += sb.toString();
        }
        System.out.println(reverseSentence);
    }
}
