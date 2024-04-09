package BasicProgramming;

import java.util.Scanner;

public class Q2_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter two numbers and find their sum

        System.out.print("Enter the value of x :- ");
        int x = sc.nextInt();
        System.out.println("The value of x :- "+x);

        System.out.print("Enter the value of y :- ");
        int y = sc.nextInt();
        System.out.println("The value of y :- "+y);

        int z = x + y;
        System.out.println("The sum is :- "+z);


    }
}
