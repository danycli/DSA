package Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String [] args) {
        int[] x = {9,8,7,6,1,2,5,3,4};
        for(int i = 0; i < x.length-1; i++){
            int index = i;
            int smallest = x[i];
            for(int j = i+1; j < x.length; j++){
                if(x[j] < smallest){
                    smallest = x[j];
                    index = j;
                }
            }
            if(index != i){
                int temp = x[i];
                x[i] = smallest;
                x[index] = temp;
            }
        }

        System.out.println(Arrays.toString(x));
    }
}
