import java.util.*;

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = input.nextInt();
        int k = 1;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                if(k % 2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
                k++;
            }
            System.out.println();
        }
        input.close();
    }
}
