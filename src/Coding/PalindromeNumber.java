package Coding;

public class PalindromeNumber {
    public static void main(String [] args){
        int number = 1331;
        int reverse = 0;
        int original = number;
        while(number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        boolean isPalindrome = (original == reverse);
        if(isPalindrome){
                System.out.println(reverse + " Palindrome Number");
            }else{System.out.println(reverse + " Non Palindrome Number");}
        }
}

// A number that stays the same when read from left to right and right to left.
// 1331 → reverse → 1331 (Palindrome Number)
// 456 → reverse → 654 (Non Palindrome Number)