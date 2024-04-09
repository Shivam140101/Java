package Loop_Que;

// 44.	Write a Java program to convert Octal to Hexadecimal number system.

import java.util.Scanner;

public class Q44_Oct_to_Hexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int octalNumber = sc.nextInt();

        int decimalNumber = 0;
        int place = 0;

        while (octalNumber != 0) {
            int digit = octalNumber % 10;
            int power = 0;
            int temp = digit;

            while (temp != 0) {
                int remainder = temp % 8;
                decimalNumber += remainder * (int) Math.pow(8, place + power);
                temp /= 8;
                power++;
            }

            octalNumber /= 10;
            place += 3;
        }

        char[] hexadecimalDigits = new char[100];
        int index = 0;

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 16;
            char hexChar;

            if (remainder >= 0 && remainder <= 9) {
                hexChar = (char) (remainder + '0');
            } else {
                hexChar = (char) (remainder - 10 + 'A');
            }

            hexadecimalDigits[index] = hexChar;
            decimalNumber /= 16;
            index++;
        }

        System.out.print("Hexadecimal number: ");

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hexadecimalDigits[i]);
        }

        System.out.println();
    }
}
