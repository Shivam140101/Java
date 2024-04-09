package Loop_Que;

// 47.	Write a Java program to convert Decimal to Hexadecimal number system.

import java.util.Scanner;

public class Q47_Dec_to_Hexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int deci = sc.nextInt();

        StringBuilder hexadecimalNumber = new StringBuilder();

        if (deci == 0) {
            hexadecimalNumber.append("0");
        } else {
            while (deci > 0) {
                int remainder = deci % 16;
                if (remainder < 10) {
                    hexadecimalNumber.insert(0, (char) (remainder + '0'));
                } else {
                    hexadecimalNumber.insert(0, (char) (remainder - 10 + 'A'));
                }
                deci /= 16;
            }
        }

        System.out.println("Hexadecimal number: " + hexadecimalNumber);



    }
}
