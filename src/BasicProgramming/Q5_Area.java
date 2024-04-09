package BasicProgramming;

import java.util.Scanner;

public class Q5_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter length and breadth of a rectangle and find its area.

        System.out.print("Enter length of rect:- ");
        int len = sc.nextInt();
        System.out.println("length:- "+len);

        System.out.print("Enter breadth of rect: ");
        int bre = sc.nextInt();
        System.out.println("breadth:- "+bre);

        int area = len * bre;
        System.out.println("The area of rectangle is:- "+area);
    }
}
