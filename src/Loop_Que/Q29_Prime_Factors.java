package Loop_Que;

// 29.	Write a Java program to find all prime factors of a number.

import java.util.Scanner;

public class Q29_Prime_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int number = sc.nextInt();

        System.out.println("Prime factors of " + number + " are: ");

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }
    }
}
