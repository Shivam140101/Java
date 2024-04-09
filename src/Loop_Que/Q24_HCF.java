package Loop_Que;

// 24.	Write a Java program to find HCF (GCD) of two numbers.

import java.util.Scanner;

public class Q24_HCF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int hcf = 1;
        int smallerNumber = Math.min(number1, number2);

        for (int i = 1; i <= smallerNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                hcf = i;
                System.out.println(hcf);
            }
        }

        System.out.println("HCF of " + number1 + " and " + number2 + " is: " + hcf);

    }
}
