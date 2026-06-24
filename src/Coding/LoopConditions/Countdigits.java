package Coding.LoopConditions;

public class Countdigits {
    public static void main(String [] args){
        int number = 42801;
        int countdigits = 0;
        while(number > 0){
            number = number / 10;
            countdigits++;
        }
        System.out.println("Total digits in the number are: " + countdigits);
    }
}
