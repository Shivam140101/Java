package Loop_Que;

// 6.	Write a Java program to find sum of all natural numbers between 1 to n.

import java.util.Scanner;

public class Q6_Sum_from_1_to_N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i=1 ; i<=num ; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of Numbers Between 1 to "+num+" is :- " +sum);
    }
}
