package Patterns;

import java.util.Arrays;

public class sorting {
    public static void main (String [] args){
        int[] x = {5,2,6,8,9};
        //Ascending
        for(int i = 0; i < x.length-1; i++){
            for(int j = i; j < x.length-1-i; j++){
                if(x[j] > x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));

        //Descending
        for(int i = x.length-1; i > 0; i--){
            for(int j = x.length-1; j > 0; j--){
                if(x[j] > x[j-1]){
                    int temp =x[j];
                    x[j] = x[j-1];
                    x[j-1] = temp; 
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
