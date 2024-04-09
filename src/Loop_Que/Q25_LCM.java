package Loop_Que;

// 25.	Write a Java program to find LCM of two numbers.

import java.util.Scanner;

public class Q25_LCM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int lcm = Math.max(number1, number2);

        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
    }
}
