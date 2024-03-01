import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            System.out.println("Enter any number : ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }

       else{
        System.out.println(num + " is an odd number.");
        }
        
        // To prevent memory leak 
        // Prevents scanner to run continously
        input.close();
    }
}
