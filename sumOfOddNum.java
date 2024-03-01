import java.util.*;

public class sumOfOddNum {
    public static int sumofodds(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
            else{
                continue;
            }
        }
        System.out.println("The sum of odd numbers are : " + sum);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int size = input.nextInt();
        sumofodds(size);
        input.close();
    }
}
