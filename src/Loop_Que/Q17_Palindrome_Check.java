package Loop_Que;

// 17.	Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;

public class Q17_Palindrome_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int num1 = num;
        int sum=0;
        while (num>0)
        {
            int r = num%10;
            sum = sum * 10 + r;
            num = num/10;
        }
        if (num1==sum)
        {
            System.out.println(num1+" is Palindrome");
        }
        else
        {
            System.out.println(num1+" is Not a palindrome");
        }

    }
}
