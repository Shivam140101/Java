package Loop_Que;

// 11.	Write a Java program to find first and last digit of a number.

import java.util.Scanner;

public class Q11_First_Last {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int num1 = num;
        int first = 0;
        int last = num%10;

        while (num != 0) {
            first = num;
            num /= 10;
        }

        System.out.println("First digit of "+num1+" is :- "+first);
        System.out.println("Last digit of "+num1+" is :- "+last);
    }
}
