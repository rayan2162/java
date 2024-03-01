import java.util.*;

public class inverteNumberHalfPyramid {
   public static void main(String[] args) {
    Scanner input = new  Scanner(System.in);

    System.out.println("Enter the size : ");
    int size = input.nextInt();

    for(int i = size; i > 0; i--){
        for(int j = 1; j <= i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    input.close();
   } 
}
