import java.util.*;

public class function1{
    public static void greetingmessage(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.next();
        greetingmessage(name);

        input.close();
    }
}