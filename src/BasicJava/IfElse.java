package BasicJava;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of  x  ");
        int x = sc.nextInt();
        System.out.println("x =  "+x);

        System.out.print("Enter a value of  y  ");
        int y = sc.nextInt();
        System.out.println("y =  "+y);
        if(x > y) {
            System.out.println("X is Greatest");
            System.out.println("x =  "+x);
        }
        else {
            System.out.println("y is Greatest");
            System.out.println("y =  "+y);
        }
        System.out.println("Out of if -else stmt ");
        System.out.println("End of main ");
    }
}
