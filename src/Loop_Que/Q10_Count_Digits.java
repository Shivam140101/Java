package Loop_Que;

// 10.	Write a Java program to count number of digits in a number.

import java.util.Scanner;

public class Q10_Count_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int num1 = num;

        int count = 0;
        while (num>0){
            num = num/10;
            count++;
        }
        System.out.println("Number of Digits in "+num1+" are:- "+count);
    }
}
