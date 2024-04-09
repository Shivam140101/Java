package Loop_Que;

// 33.	Write a Java program to print all Perfect numbers between 1 to n.

import java.util.Scanner;

public class Q33_Perfect_Print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        System.out.println("Perfect numbers between 1 and " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }


    }
}
