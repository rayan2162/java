import java.util.*;

public class invertedHalfPyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of the inverted half pyramid : ");
        int size = input.nextInt();

        for(int i = size; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
