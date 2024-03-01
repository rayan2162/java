import java.util.*;
public class averageFunction {

    public static int avgfun (int a, int b, int c){
        float average = ((a + b + c) / 3);
        System.out.print(average);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        avgfun(num1, num2, num3);
        input.close();
        
    }
}
