package Coding.LoopConditions;

public class Primenumber {
    public static void main(String [] args){
        for(int i=1; i<=10; i++){
            boolean isPrime = true;
            if(i<=1){
                isPrime = false;
            }
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+" prime");
            }else {
                System.out.println(i+" not prime");
            }
        }
    }
}

// it can only divide evenly by 1 and by the number itself.
// 2 is the only even prime number
// all odd numbers as prime (which is incorrect because 9 is odd but not prime)