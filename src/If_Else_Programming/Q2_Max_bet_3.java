package If_Else_Programming;

import java.util.Scanner;

public class Q2_Max_bet_3 {
    public static void main(String[] args) {
        // Write a program to find maximum between three numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x:- ");
        int x = sc.nextInt();
        System.out.println("x:- "+x);

        System.out.print("Enter the value of y:- ");
        int y = sc.nextInt();
        System.out.println("y:- "+y);

        System.out.print("Enter the value of z:- ");
        int z = sc.nextInt();
        System.out.println("z:- "+z);

        if (x>y && x>z)
            System.out.println("Maximum is:- "+x);
        else if (y>x && y>z)
            System.out.println("Maximum is:- "+y);
        else
            System.out.println("Maximum is:- "+z);
    }
}
