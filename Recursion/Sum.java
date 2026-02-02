package Recursion;

public class Fibonacci {
    public static void fib(int x, int sum){
        if(x == 0){
            System.out.println(sum);
            return;
        }
        sum+=x;
        fib(x-1,sum);
    }
    public static void main(String [] args){
        fib(6,0);
    }
}
