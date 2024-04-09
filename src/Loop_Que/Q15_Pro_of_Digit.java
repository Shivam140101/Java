package Loop_Que;

// 15.	Write a Java program to calculate product of digits of a number.

import java.util.Scanner;

public class Q15_Pro_of_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int digitPro=1;
        int originalNumber = num;

        while (num != 0) {
            int digit = num % 10;
            digitPro *= digit;
            num /= 10;
        }

        System.out.println("Number: " + originalNumber);
        System.out.println("Sum of digits: " + digitPro);
    }
}
