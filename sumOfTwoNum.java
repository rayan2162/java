
import java.util.*;
public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        num1 = input.nextInt();
        num2 = input.nextInt();

        int sum = num1 + num2;
            
            System.out.println(sum);
        // To prevent memory leak 
        // Prevents scanner to run continously
        input.close(); 
    }   
}
