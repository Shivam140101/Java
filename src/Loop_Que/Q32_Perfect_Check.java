package Loop_Que;

// 32.	Write a Java program to check whether a number is Perfect number or not.

import java.util.Scanner;

public class Q32_Perfect_Check {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
