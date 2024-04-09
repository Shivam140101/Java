package Loop_Que;

// 48.	Write a Java program to convert Hexadecimal to Binary number system.

import java.util.Scanner;

public class Q48_Hexa_to_Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        String hex = sc.nextLine();


        String binary = "";
        int length = hex.length();

        for (int i = 0; i < length; i++) {
            char c = hex.charAt(i);
            int decimal;

            if (c >= '0' && c <= '9') {
                decimal = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                decimal = 10 + (c - 'A');
            } else if (c >= 'a' && c <= 'f') {
                decimal = 10 + (c - 'a');
            } else {
                System.out.println("Invalid hexadecimal number!");
                return;
            }

            String binaryDigit = "";
            while (decimal > 0) {
                int remainder = decimal % 2;
                binaryDigit = remainder + binaryDigit;
                decimal = decimal / 2;
            }

            binary += binaryDigit;
        }

        System.out.println("Binary: " + binary);

    }
}
