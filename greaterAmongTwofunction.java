import java.util.*;

public class greaterAmongTwofunction {
    public static void greateramongtwo(int a, int b){
        if(a > b){
            System.out.println(a + " is greater than " + b);
        }
        else{
            System.out.println(b + " is greater than " + a);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        greateramongtwo(num1, num2);
        input.close();
    }
}
