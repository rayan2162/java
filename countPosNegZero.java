import java.util.*;

public class countPosNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = input.nextInt();

        int posCounter = 0, negCounter = 0, zeroCounter = 0;

        for(int i = 0; i < range; i++){
            System.out.println("Enter any number : ");
            float number = input.nextFloat();
            if( number > 0){
                posCounter = posCounter + 1;
            }
            else if(number < 0){
                negCounter = negCounter + 1;
            }
            else{
                zeroCounter = zeroCounter + 1;
            }
        }

        System.out.println("There are "+ posCounter +" positive numbers.");
        System.out.println("There are "+ negCounter +" negetive numbers.");
        System.out.println("There are "+ zeroCounter +" zeros.");

        input.close();
    }
}
