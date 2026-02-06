package Patterns;

public class WaterTank {
    public static int tank(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                int height = Math.min(arr[i], arr[j]);
                int temp = height * (j - i); 
                if(temp > res){
                    res = temp;
                }
            }
        }
        return res;
    }
    public static void main(String [] args){
        int[] arr = {4,3,2,1,4};

        int capacity = tank(arr);
        System.out.println("Maximum Capacity = "+capacity);
    }
}
