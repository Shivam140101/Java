package Loop_Que;

// 23.	Write a Java program to calculate factorial of a number.

import java.util.Scanner;

public class Q23_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i=num; i>=1 ; i-- ){

            fact = fact*  i;
            System.out.print(i);
            if(i>1)
                System.out.print(" * ");
        }
        System.out.println("\nFactorial of "+num+ " is : "+fact);


    }
}
