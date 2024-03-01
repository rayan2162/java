import java.util.*;

public class butterflyPattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = input.nextInt();
        // Upper Half
        for(int i = 1; i <= size; i++){
            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int l = 1; l <= (2*(size - i)); l++){
                System.out.print(" ");
            }
            // 2nd part
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        
        }

        // Lower Half
        for(int i = size; i >= 1; i--){
                // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
                // Spaces
            for(int l = 1; l <= (2*(size - i)); l++){
                System.out.print(" ");
            }
            // 2nd part
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
            }
        input.close();
    }
}
