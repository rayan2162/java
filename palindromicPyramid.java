import java.util.*;

public class palindromicPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = input.nextInt();
        for(int i = 1; i <= size; i++){
            for(int k = 1; k <= (size - i); k++){
                System.out.print(" ");
            }
            for(int j = i; j >=1; j--){
                System.out.print(j);
            }
            for(int l = 2 ; l <= i; l++ ){
                    System.out.print(l);
            }
            System.out.println();
        }
        input.close();
    }
}
