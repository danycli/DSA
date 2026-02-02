package Recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }else if(n <= 2){
            return 1;
        }
        int fib1 = fib(n-1) + fib(n-2);
        return fib1;
    }
    public static void main(String [] args){
        for(int i = 0; i < 6; i++){
            System.out.println(fib(i));
        }
    }
}
