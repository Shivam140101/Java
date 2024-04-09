package Loop_Que;

// 42.	Write a Java program to convert Octal to Binary number system.

import java.util.Scanner;

public class Q42_Oct_to_Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int oct = sc.nextInt();
        sc.close();

        long binary = 0;
        int place = 1;

        while (oct != 0) {
            int digit = oct % 10;
            int power = 0;
            int decimal = 0;

            while (digit != 0) {
                int remainder = digit % 8;
                decimal += remainder * Math.pow(8, power);
                digit /= 8;
                power++;
            }

            oct += decimal * place;
            place *= 1000;
            oct /= 10;
        }

        System.out.println("Binary number: " + binary);
    }
}
