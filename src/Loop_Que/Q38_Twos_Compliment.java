package Loop_Que;

// 38.	Write a Java program to find two's complement of a binary number.

import java.util.Scanner;

public class Q38_Twos_Compliment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        String  num = sc.nextLine();

        boolean FirstOne = false;
        char[] twosComplement = new char[num.length()];

        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);

            if (digit == '0' && !FirstOne) {
                twosComplement[i] = '0';
            } else if (digit == '1' && !FirstOne) {
                FirstOne = true;
                twosComplement[i] = '1';
            } else if (digit == '0' && FirstOne) {
                twosComplement[i] = '1';
            } else if (digit == '1' && FirstOne) {
                twosComplement[i] = '0';
            } else {
                System.out.println("Invalid binary number.");
                return;
            }
        }

        System.out.println("Two's complement: " + String.valueOf(twosComplement));
    }
}
