package BasicJava;
import java.util.Scanner;
public class LogicalOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of x  ");
        int x = sc.nextInt();
        System.out.println("x =  "+x);

        System.out.print("Enter a value of y  ");
        int y = sc.nextInt();
        System.out.println("y =  "+y);

        System.out.print("Enter a value of z  ");
        int z = sc.nextInt();
        System.out.println("z =  "+z);

        boolean and1 =(x > y ) && (z == 15) ;
        System.out.println("Logical short-circuits  AND  && "+and1);

        and1 =(x > y ) & (x != z) ;
        System.out.println("Logical  AND  & "+and1);

        boolean or1 =(x < y ) || (z != 0);
        System.out.println("Logical short-circuits OR || "+or1);

        or1 =(x > y ) | (x != y) ;
        System.out.println("Logical   OR | "+or1);
        boolean not1 = !(x <= y );
        System.out.println("Logical NOT ! "+not1);


    }
}
