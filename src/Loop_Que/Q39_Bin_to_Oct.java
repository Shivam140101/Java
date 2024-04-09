package Loop_Que;

// 39.	Write a Java program to convert Binary to Octal number system.

import java.util.Scanner;

public class Q39_Bin_to_Oct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number:- ");
        long num = sc.nextLong();

        int octalNumber = 0;
        int decimalNumber = 0;
        int place = 0;

        while (num != 0) {
            decimalNumber += (num % 10) * Math.pow(2, place);
            ++place;
            num /= 10;
        }

        place = 1;

        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * place;
            decimalNumber /= 8;
            place *= 10;
        }

        System.out.println("Octal number: " + octalNumber);

    }
}
