import java.util.*;

public class sumOfNumbersUsingLoop {
   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

            System.out.println("Enter the range : ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        
            System.out.println("The sum of first " + n + " numbers : " + sum);

        // To prevent memory leak 
        // Prevents scanner to run continously
        input.close();
   } 
}
