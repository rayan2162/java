import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = input.nextInt();

        int arr[] = new int[size];
        // If we know element in first
        // int arr[]={1,2,3,4,5};

        
        System.out.println("Enter " + size + " elements in the array : ");
        for(int i = 0; i < size; i++){
             arr[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("The elements of the array is : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
