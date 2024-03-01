import java.util.*;

public class switchExample {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            System.out.println("Enter 1 for hello!");
            System.out.println("Enter 2 for Assalamuaikum!");
            System.out.println("Enter 3 for Bonjur!");;
        int greeting = input.nextInt();

        switch(greeting){
            case 1 : System.out.println("Hello!");
                     break;

            case 2 : System.out.println("Assalamualikum!");
                     break;
            
            case 3 : System.out.println("Bonjur!");
                     break;

            default : System.out.println("Invalid input!");
        }
    
        // To prevent memory leak 
        // Prevents scanner to run continously
        input.close(); 
    }
}
