import java.util.*;

public class solidsquare {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            System.out.println("Enter size : ");
            int size = input.nextInt();

            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        input.close();
    }
}