package Loop_Que;

// 34.	Write a Java program to check whether a number is Strong number or not.

import java.util.Scanner;

public class Q34_Strong_Check {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
