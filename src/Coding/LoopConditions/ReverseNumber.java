package Coding.LoopConditions;

public class ReverseNumber {
    public static void main(String [] args){
        int number = 812;
        int reverse = 0;
        int remainder;
        while (number>0){
            remainder = number % 10;
            reverse = reverse*10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
    }
}

// %10 → take last digit
// 10 → remove last digit