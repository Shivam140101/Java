package BasicProgramming;

import java.util.Scanner;

public class Q13_Find_3rdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a program to enter two angles of a triangle and find the third angle.
        System.out.print("Enter 1st angle:- ");
        int ang1 = sc.nextInt();
        System.out.println("1st angle:- "+ang1);

        System.out.print("Enter 2nd angle:- ");
        int ang2 = sc.nextInt();
        System.out.println("2nd angle:- "+ang2);

        int ang3 = 180 - (ang1 + ang2);
        System.out.println("3rd angle is:- "+ang3);
    }
}
