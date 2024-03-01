import java.util.*;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = input.nextInt();
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= (size - i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        input.close();
    }
}
