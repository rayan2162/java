import java.util.*;

public class searchFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements in the array : ");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = input.nextInt();

        for(int i = 0; i < size; i++){
            int pos = 1;
            if(arr[i] ==  target){
                pos = i + pos;
                System.out.println("The target value is at position : "+ pos);
            }
            else{
                continue;
            }
        }

        input.close();
    }
}
