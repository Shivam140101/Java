package BasicProgramming;

import java.util.Scanner;

public class Q12_SqRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter any number and calculate its square root.

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        System.out.println("number:- "+num);

        int root = (int)Math.sqrt(num);
        System.out.println("square root is:- "+root);

    }
}
