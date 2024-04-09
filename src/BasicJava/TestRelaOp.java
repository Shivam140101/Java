package BasicJava;
import java.util.*;
public class TestRelaOp {
    public static void main(String[] args) {
        System.out.println("Example of Relational  operator ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of  x  ");
        int x = sc.nextInt();
        System.out.println("x =  "+x);

        System.out.print("Enter a value of  y  ");
        int y = sc.nextInt();
        System.out.println("y =  "+y);

        boolean  rs;
        rs = x == y;
        System.out.println("Is eq to   "+rs);
        rs = x != y;
        System.out.println("Is not eq to   "+rs);
        rs = x < y;
        System.out.println("Is less than    "+rs);

        rs = x <= y;
        System.out.println("Is less than eq to   "+rs);

        rs = x > y;
        System.out.println("Is Greater  than    "+rs);

        rs = x >= y;
        System.out.println("Is Greater than eq to   "+rs);

    }
}
