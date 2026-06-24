package Coding;

public class fibonacciSeries {
    public static void main(String [] args){
        int first = 0; int second = 1; int next,i; int count =5;
        System.out.println(first+" " + second +" ");
        for(i=0;i<count;i++){
            next = first + second;
            System.out.print(next+ " ");
            first = second;
            second = next;
        }
    }
}

// Fibonacci Series: Each number = sum of previous two numbers
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...