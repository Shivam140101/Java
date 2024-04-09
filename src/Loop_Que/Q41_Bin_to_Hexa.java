package Loop_Que;

// 41.	Write a Java program to convert Binary to Hexadecimal number system.

import java.util.Scanner;

public class Q41_Bin_to_Hexa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number:-  ");
        long num = sc.nextLong();

        String hexa = "";
        int place = 0;

        while (num != 0) {
            long decimal = 0;
            int power = 0;
            long tempBinary = num % 10000;

            while (tempBinary != 0) {
                int digit = (int) (tempBinary % 10);
                decimal += digit * Math.pow(2, power);
                ++power;
                tempBinary /= 10;
            }

            char hexChar;
            if (decimal >= 0 && decimal <= 9) {
                hexChar = (char) (decimal + '0');
            } else {
                hexChar = (char) (decimal - 10 + 'A');
            }

            hexa = hexChar + hexa;
            num /= 10000;
        }

        System.out.println("Hexadecimal number: " + hexa);
    }
}
