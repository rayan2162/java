import java.util.*;

public class conditionalFunction {
    public static void eligible(int age){
        if( age >= 18){
            System.out.println("Congrats! You are eligible for voting!");
        }
        else{
            System.out.println("Sorry, You are not eligible for voting.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();

        eligible(age);
        input.close();
    }
}
