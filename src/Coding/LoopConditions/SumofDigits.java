package Coding.LoopConditions;

public class SumofDigits {
    public static void main(String [] args){
        int number = 12345; int sumofdigits = 0;
        while(number>0){
            sumofdigits = sumofdigits + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of digits is: " + sumofdigits);
        boolean greaterthan = (sumofdigits > 10);
        if(greaterthan){
            System.out.println("Sum of digits is greater than 10");
        }else {System.out.println("Sum of digits is less than or equal to 10");}
    }
}

// “sum of digits” means something different. number = 12345
// sum = 1 + 2 + 3 + 4 + 5 = 15