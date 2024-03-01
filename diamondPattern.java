import java.util.*;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = input.nextInt();

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= (size-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int l = 1; l <= (i - 1); l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = size; i >= 1; i--){
            for(int j = 1; j <= (size-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int l = 1; l <= (i - 1); l++){
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
