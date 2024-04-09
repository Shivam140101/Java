package Loop_Que;

// 27.	Write a Java program to print all Prime numbers between 1 to n.

import java.util.Scanner;

public class Q27_Print_Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

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
                System.out.print(i);
                if (i<num-1){
                    System.out.print(",");
                }
            }
        }

    }
}
