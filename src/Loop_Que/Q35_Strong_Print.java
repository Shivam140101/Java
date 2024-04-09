package Loop_Que;

// 35.	Write a Java program to print all Strong numbers between 1 to n.

import java.util.Scanner;

public class Q35_Strong_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int num = sc.nextInt();

        System.out.println("Strong numbers between 1 and " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            int temp = i;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                int factorial = 1;

                for (int j = 1; j <= digit; j++) {
                    factorial *= j;
                }

                sum += factorial;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
