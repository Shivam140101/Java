package Loop_Que;

// 37.	Write a Java program to find one's complement of a binary number.

import java.util.Scanner;

public class Q37_Ones_Compliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number:- ");
        String num = sc.nextLine();

        char[] onesComplement = new char[num.length()];

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            if (digit == '0') {
                onesComplement[i] = '1';
            } else if (digit == '1') {
                onesComplement[i] = '0';
            } else {
                System.out.println("Invalid binary number.");
                return;
            }
        }

        System.out.println("One's complement: " + String.valueOf(onesComplement));
    }
}
