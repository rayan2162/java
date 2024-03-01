import java.util.*;
//1 1 2 3 5 8 13 21 
public class fibonacchi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = input.nextInt();
        int first = 1;
        int second = 1;
        System.out.println("The first " + range + " fibonacchi numbers are :");
        System.out.print("0 " + first + " " + second + " ");
        for(int i = 4; i <= range; i++){
            int show = first + second;
            first = second; 
            second = show;
            System.out.print(show+" ");
        }
        input.close();
    }
}
