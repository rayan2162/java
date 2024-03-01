import java.util.*;

public class elseif {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the value of A, B, C : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if(a == b && a == c){
            System.out.println("They are equal!");
        }
        else if( a > b && a > c){
            System.out.println("A is greater!");
        }
        else if( b > a && b > c){
            System.out.println("B is greater!");
        }
        else{
            System.out.println("C is greater!");
        }
        // To prevent memory leak 
        // Prevents scanner to run continously
        input.close();
    }  
}
