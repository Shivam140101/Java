package Loop_Que;

// 22.	Write a Java program to find all factors of a number.

import java.util.Scanner;

public class Q22_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        System.out.print("Factors of " + num + " is : ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i);
                if (i<num){
                    System.out.print(",");
                }
            }
        }

    }
}
