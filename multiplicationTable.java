import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            System.out.println("Enter any number : ");
        int n = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }

        input.close();
    }
}
