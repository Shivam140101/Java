package If_Else_Programming;

import java.util.Scanner;

public class Q16_Equi_Iso_Sca {
    public static void main(String[] args) {
        //Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of a triangle:- ");
        int s1 = sc.nextInt();
        System.out.println("Side 1:- " +s1);

        System.out.print("Enter side 2 of a triangle:- ");
        int s2 = sc.nextInt();
        System.out.println("Side 2:- "+s2);

        System.out.print("Enter side 3 of a triangle:- ");
        int s3 = sc.nextInt();
        System.out.println("Side 3:- "+s3);

        if (s1==s2 && s2==s3)
            System.out.println("It is an equilateral triangle");
        else if (s1==s2 || s1==s3 || s2==s3)
            System.out.println("It is an isosceles triangle");
        else
            System.out.println("It is a scalene triangle");
    }
}
