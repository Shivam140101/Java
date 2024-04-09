package Loop_Que;

// 14.	Write a Java program to calculate sum of digits of a number.

import java.util.Scanner;

public class Q14_Sum_of_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int digitSum = 0;
        int originalNumber = num;

        while (num != 0) {
            int digit = num % 10;
            digitSum += digit;
            num /= 10;
        }

        System.out.println("Number: " + originalNumber);
        System.out.println("Sum of digits: " + digitSum);


    }
}
