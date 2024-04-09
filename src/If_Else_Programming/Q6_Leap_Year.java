package If_Else_Programming;

import java.util.Scanner;

public class Q6_Leap_Year {
    public static void main(String[] args) {
        //Write a program to check whether a year is leap year or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:- ");
        int year = sc.nextInt();
        System.out.println("Year:- "+year);

        if(year%4==0 && year%100!=0 || year%400==0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");

    }
}
