package If_Else_Programming;

import java.util.Scanner;

public class Q1_Max_bet_2 {
    public static void main(String[] args) {
        // Write a program to find maximum between two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x:- ");
        int x = sc.nextInt();
        System.out.println("x:- "+x);

        System.out.print("Enter the value of y:- ");
        int y = sc.nextInt();
        System.out.println("y:- "+y);

        if (x>y)
            System.out.println("Maximum no. is:- "+x);
        else
            System.out.println("Maximum no. is:- "+y);
    }
}
