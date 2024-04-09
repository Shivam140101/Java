package Loop_Que;

// 8.	Write a Java program to find sum of all odd numbers between 1 to n.

import java.util.Scanner;

public class Q8_SumOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int sum=0;

        for (int i=1 ; i<=num ; i++){
            if ((i+1)%2==0){
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum of Odd Numbers between 1 to "+num+" is:- "+sum);
    }
}
