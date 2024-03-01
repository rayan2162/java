import java.util.*;

class ifElse{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
            System.out.println("Enter your age : ");
        int age = input.nextInt();

        if(age > 18){
            System.out.println("You are eligible for voting!");
        }
        else{
            System.out.println("You aren't eligible for voting!");
        }
            // To prevent memory leak 
        // Prevents scanner to run continously
        input.close();
    }
}