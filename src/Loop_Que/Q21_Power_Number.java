package Loop_Que;

// 21.	Write a Java program to find power of a number using for loop.

import java.util.Scanner;

public class Q21_Power_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= num;
        }

        System.out.println(num + " raised to the power of " + exponent + " = " + result);

    }
}
