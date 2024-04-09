package BasicJava;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of  x  ");
        int x = sc.nextInt();
        System.out.println("x =  "+x);

        System.out.print("Enter a value of  y  ");
        int y = sc.nextInt();
        System.out.println("y =  "+y);

        System.out.print("Enter a value of  yz  ");
        int z = sc.nextInt();
        System.out.println("z =  "+z);
        if(x > y) {
            if(x > z)
                System.out.println("X is Greatest");
            else
                System.out.println("z is Greatest............");
        }
        else {
            if(y > z)
                System.out.println("y is Greatest");
            else
                System.out.println("z is Greatest");

        }
        System.out.println("Out of if -else stmt ");
        System.out.println("End of main ");
    }
}
