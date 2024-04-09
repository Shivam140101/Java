package Loop_Que;

// 13.	Write a Java program to swap first and last digits of a number.

import java.util.Scanner;

public class Q13_Swap_First_Last {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int originalNumber = num;
        int divisor = 1;

        while (num >= 10) {
            num /= 10;
            divisor *= 10;
        }

        int firstDigit = num;
        int lastDigit = originalNumber % 10;

        int remainingDigits = originalNumber % divisor;
        int swappedNumber = lastDigit * divisor + remainingDigits / 10 * 10 + firstDigit;

        System.out.println("Original Number :- "+originalNumber);
        System.out.println("Number after swapping:- "+swappedNumber);

    }
}
