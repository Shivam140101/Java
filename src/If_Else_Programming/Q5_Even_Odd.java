package If_Else_Programming;

import java.util.Scanner;

public class Q5_Even_Odd {
    public static void main(String[] args) {
        //Write a program to check whether a number is even or odd.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = sc.nextInt();
        System.out.println("Your number:- "+num);

        if (num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
