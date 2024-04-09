package BasicJava;
import java.util.Scanner;
public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of x  ");
        int x = sc.nextInt();
        System.out.println("x =  "+x);

        System.out.print("Enter a value of y  ");
        int y = sc.nextInt();
        System.out.println("y =  "+y);

        int rs = (x < y)  ?  x  : y;
        System.out.println("results  =  "+rs);

    }
}
