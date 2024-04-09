package Loop_Que;

import java.util.Scanner;

public class Q50_Hexa_to_Deci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        String hex = sc.nextLine();

        int decimal = 0;
        int length = hex.length();

        for (int i = 0; i < length; i++) {
            char c = hex.charAt(i);
            int digit;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = 10 + (c - 'A');
            } else if (c >= 'a' && c <= 'f') {
                digit = 10 + (c - 'a');
            } else {
                System.out.println("Invalid hexadecimal number!");
                return;
            }

            decimal = decimal * 16 + digit;
        }

        System.out.println("Decimal: " + decimal);
    }
}
