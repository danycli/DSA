public class patterns {
    public static void main(String [] args){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8-1; j++){
                System.out.print(" ");
            }
            for(int z = 0; z <=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
