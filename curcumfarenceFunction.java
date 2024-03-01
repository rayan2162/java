import java.util.*;

public class curcumfarenceFunction {
    
    public static double curcumferencefun(int radius){
        double PI = 3.14159265359;
        double curcumference = 2* PI * radius;
        System.out.println("The circumference of the circle is : " + curcumference);
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        int radius = input.nextInt();

        curcumferencefun(radius);

        input.close();
    }
}
