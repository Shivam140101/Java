package Loop_Que;

// 36.	Write a Java program to print Fibonacci series up to n terms.

import java.util.Scanner;

public class Q36_Fibonacci {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        System.out.println("Fibonacci series up to " + num + " terms:");
        if (num >= 1) {
            System.out.print("0");
        }
        if (num >= 2) {
            System.out.print(", 1");
        }

        int num1 = 0, num2 = 1;
        for (int i = 3; i <= num; i++) {
            int nextNum = num1 + num2;
            System.out.print(", " + nextNum);

            num1 = num2;
            num2 = nextNum;
        }
    }
}
