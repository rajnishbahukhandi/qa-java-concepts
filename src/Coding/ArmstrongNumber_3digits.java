package Coding;

public class ArmstrongNumber_3digits {
    public static void main(String [] args){
        int number = 153;
        int sum = 0;
        int Armstrong = number;
        while(number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number = number / 10;
        }
        boolean isarmstrong = (Armstrong == sum);
        if(isarmstrong){
            System.out.println(Armstrong + " is an Armstrong Number");
        }else{System.out.println(Armstrong + " is not an Armstrong Number");}
    }
}
