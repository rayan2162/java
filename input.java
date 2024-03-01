import java.util.*;

public class input {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
// .next() is for 1 word.
    String name = sc.nextLine();
        System.out.println(name);

// .nextLine() is for multiple word.
    String name2 = sc.nextLine();
        System.out.println(name2);

// .nextInt() is for integer number.
// .nextFloat is for floating point number.
    
        // To prevent memory leak 
        // Prevents scanner to run continously
        sc.close();
    }
}