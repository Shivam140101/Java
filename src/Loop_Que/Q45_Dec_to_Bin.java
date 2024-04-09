package Loop_Que;

// 45.	Write a Java program to convert Decimal to Binary number system.

import java.util.Scanner;

public class Q45_Dec_to_Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int deci = sc.nextInt();

        String binaryNumber = "";

        if (deci == 0) {
            binaryNumber = "0";
        } else {
            while (deci > 0) {
                int remainder = deci % 2;
                binaryNumber = remainder + binaryNumber;
                deci /= 2;
            }
        }

        System.out.println("Binary number: " + binaryNumber);

    }
}
