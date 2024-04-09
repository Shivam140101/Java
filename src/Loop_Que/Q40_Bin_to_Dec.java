package Loop_Que;

// 40.	Write a Java program to convert Binary to Decimal number system.

import java.util.Scanner;

public class Q40_Bin_to_Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number:- ");
        long num = sc.nextLong();

        int decimalNumber = 0;
        int place = 0;

        while (num != 0) {
            int digit = (int) (num % 10);
            decimalNumber += digit * Math.pow(2, place);
            ++place;
            num /= 10;
        }

        System.out.println("Decimal number: " + decimalNumber);
    }
}
