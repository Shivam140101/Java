package BasicJava;
import java.util.Scanner;
public class AssignmentOp {
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

        //x = 15 y =9 z= 7
        x = x+ 7; // x = 15 + 7 = 22
        System.out.println("x =  "+x);
        x +=   13; // x = x + 12  // x = 22 + 13 = 35
        System.out.println("x =  "+x);

        y -= 4 ;// y  = 9- 4 = 5
        System.out.println("y =  "+y);
        z  *=  y; // z  = 7 * 5 = 35
        System.out.println("z =  "+z);

        x /= y; // x =x  / y  or x = 35 / 5 = 7
        System.out.println("x =  "+x);

        z %= 6;  // z = 35 % 6 = 5
        System.out.println("z =  "+z);


    }
}
