package If_Else_Programming;

import java.util.Scanner;

public class Q3_neg_pos_zero {
    public static void main(String[] args) {
        // Write a program to check whether a number is negative, positive or zero.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value:- ");
        int num = sc.nextInt();
        System.out.println("your value:- "+num);

        int zero = 0;

        if (zero>num)
            System.out.println("The number is negative");
        else if (zero<num)
            System.out.println("The number is positive");
        else
            System.out.println("The number is "+zero);

    }
}
