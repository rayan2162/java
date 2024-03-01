// rows -> outer loop.
// column -> inner loop.

import java.util.*;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the height : ");
        int height = input.nextInt();

            System.out.println("Enter the width : ");
        int width = input.nextInt();

        for(int i = 0; i< height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
