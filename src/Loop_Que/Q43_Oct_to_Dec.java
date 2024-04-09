package Loop_Que;

// 43.	Write a Java program to convert Octal to Decimal number system.

import java.util.Scanner;

public class Q43_Oct_to_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int oct = sc.nextInt();

        int decimal = 0;
        int place = 0;

        while (oct != 0) {
            int digit = oct % 10;
            decimal += digit * Math.pow(8, place);
            ++place;
            oct /= 10;
        }

        System.out.println("Decimal number: " + decimal);


    }
}
