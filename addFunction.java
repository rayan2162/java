import java.util.*;

public class addFunction {
    public static int addition (int a, int b){
        System.out.println(a+b);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        addition(num1, num2);

        input.close();

    }
}
