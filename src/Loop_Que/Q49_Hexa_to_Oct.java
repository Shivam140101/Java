package Loop_Que;

import java.util.Scanner;

public class Q49_Hexa_to_Oct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hexa Number:- ");
        String hex = sc.nextLine();

        String octal = "";
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

            String octalDigit = "";

            while (decimal > 0) {
                int remainder = decimal % 8;
                octalDigit = remainder + octalDigit;
                decimal = decimal / 8;
            }

            octal += octalDigit;
        }

        System.out.println("Octal: " + octal);
    }
}
