import java.util.*;

public class gcd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Emter two number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int gcd = 0;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
        input.close();
    }
}