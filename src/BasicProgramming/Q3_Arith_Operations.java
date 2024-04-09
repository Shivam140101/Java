package BasicProgramming;

import java.util.Scanner;

public class Q3_Arith_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a  program to enter two numbers and perform all arithmetic operations.

        System.out.print("Enter the value of x:- ");
        int x = sc.nextInt();
        System.out.println("x:- "+x);

        System.out.print("Enter the value of y :- ");
        int y = sc.nextInt();
        System.out.println("y:- "+y);

        System.out.println("Sum of x and y :- "+(x+y));
        System.out.println("Sub of x and y :- "+(x-y));
        System.out.println("multi of x and y :- "+(x*y));
        System.out.println("div of x and y :- "+(float)x/y);
        System.out.println("rem of x and y :- "+(x%y));

    }
}
