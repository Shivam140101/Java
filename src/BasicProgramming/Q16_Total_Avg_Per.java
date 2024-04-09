package BasicProgramming;

import java.util.Scanner;

public class Q16_Total_Avg_Per {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a program to enter marks of five subjects and calculate total, average and percentage

        System.out.print("Enter the marks of 1st subject:- ");
        int sub1 = sc.nextInt();
        System.out.println("marks in subject 1:- "+sub1);

        System.out.print("Enter the marks of 2nd subject:- ");
        int sub2 = sc.nextInt();
        System.out.println("marks in subject 2:- "+sub2);

        System.out.print("Enter the marks of 3rd subject:- ");
        int sub3 = sc.nextInt();
        System.out.println("marks in subject 3:- "+sub3);

        System.out.print("Enter the marks of 4th subject:- ");
        int sub4 = sc.nextInt();
        System.out.println("marks in subject 4:- "+sub4);

        System.out.print("Enter the marks of 5th subject:- ");
        int sub5 = sc.nextInt();
        System.out.println("marks of subject 5:- "+sub5);

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks:- "+total);

        float avg = total/5;
        System.out.println("Average is:- "+avg);

        float per = avg * 100/100f;
        System.out.println("Percentage is:- "+per+"%");

    }
}
