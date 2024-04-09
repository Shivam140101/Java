package BasicProgramming;

import java.util.Scanner;

public class Q10_Days_to_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to convert days into years, weeks and days.

        System.out.print("Enter the number of days:- ");
        int num = sc.nextInt();
        System.out.println("days:- "+num);

        int year = num/365;
        System.out.println(year+" years");

        int weeks = (num%365)/7;
        System.out.println(weeks+" weeks");

        int days = num - ((year*365) + (weeks*7));
        System.out.println(days+" days");








    }
}
