package Patterns;
public class patterns {
    public static void main(String [] args){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4-i; j++){
                System.out.print(" ");
            }
            for(int z = 0; z < i; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int o = 4; o > 0; o--){
            for(int h = 0; h < 4-o; h++){
                System.out.print(" ");
            }
            for(int e = 0; e < o; e++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
