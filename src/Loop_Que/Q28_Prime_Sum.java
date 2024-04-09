package Loop_Que;

// 28.	Write a Java program to find sum of all prime numbers between 1 to n.

import java.util.Scanner;

public class Q28_Prime_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int sum = 0;

        System.out.println("Prime numbers between 1 and " + num + ":");

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum+= i;
                System.out.print(i);
                if (i<num-1){
                    System.out.print(",");
                }
            }
        }
        System.out.println("\nSum of Prime No. between 1 to "+num+" is :- "+sum);
    }
}
