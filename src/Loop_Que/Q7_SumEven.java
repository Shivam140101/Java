package Loop_Que;

// 7.	Write a Java program to find sum of all even numbers between 1 to n.

import java.util.Scanner;

public class Q7_SumEven {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i=1 ; i<=num ; i++){
            if (i%2==0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of Even Numbers from 1 to "+num+" is :- " +sum);
    }
}
