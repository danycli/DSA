package Recursion;

public class Sum {
    public static void sum(int x, int sum){
        if(x == 0){
            System.out.println(sum);
            return;
        }
        sum+=x;
        sum(x-1,sum);
    }
    public static void main(String [] args){
        sum(6,0);
    }
}
