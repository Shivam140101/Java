package Loop_Que;

// 30.	Write a Java program to check whether a number is Armstrong number or not.

import java.util.Scanner;

public class Q30_Armstrong_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int num1 = num;
        int num2=num;
        int count=0;
        int sum = 0;
        while (num>0)
        {
            count++;
            num = num/10;
        }
        while (num1>0)
        {
            int rem = num1%10;
            sum = sum + (int)Math.pow(rem,count);
            num1 = num1/10;
        }
        if (num2==sum){

            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not a armstrong");
        }
    }
}
