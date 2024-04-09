package Loop_Que;

//     16.	Write a Java program to enter a number and print its reverse.

import java.util.Scanner;

public class Q16_Print_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int reversedNumber = 0;
        int originalNumber = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
