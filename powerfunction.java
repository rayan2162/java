import java.util.*;

public class powerfunction {
    public static double powfun(int base, int power){
        double ans = Math.pow(base, power);
        System.out.println("Answer is : "+ ans);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = input.nextInt();
        
        System.out.println("Enter the power : ");
        int power = input.nextInt();

        powfun(base, power);

        input.close();
    }
}
