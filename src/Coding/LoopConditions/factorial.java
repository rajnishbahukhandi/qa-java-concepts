package Coding.LoopConditions;

public class factorial {
    public static void main(String [] args){
        int fact = 1;
        for(int i=1;i<=5;i++){
            fact = i * fact;
        }
        System.out.println(fact);
    }
}

// Multiply a number by all positive numbers before it until 1.
// 5! = 5 × 4 × 3 × 2 × 1 = 120