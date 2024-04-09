package BasicJava;
import java.util.*;
public class TestAirth {
    public static void main(String[] args) {
        System.out.println("Example of Arithmetic operator ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of  x :- ");
        int x = sc.nextInt();
        System.out.println("x =  "+x);

        System.out.print("Enter a value of  y :- ");
        int y = sc.nextInt();
        System.out.println("y =  "+y);
        // 10 20
        int rs;
        rs = x+y;
        System.out.println("sum =  "+rs);
        System.out.println("sum =  "+(x+y));
        System.out.println("sub =  "+(x-y));
        System.out.println("mul =  "+(x*y));
        System.out.println("div =  "+(float)x/y);
        System.out.println("Rem =  "+(x%y));
    }

}
