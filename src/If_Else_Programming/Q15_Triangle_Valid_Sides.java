package If_Else_Programming;

import java.util.Scanner;

public class Q15_Triangle_Valid_Sides {
    public static void main(String[] args) {
        //Write a program to input all sides of a triangle and check whether triangle is valid or not

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

        int a = s1 + s2;
        int b = s2 + s3;
        int c = s3 + s1;

        if (a>s3 && b>s1 && c>s2)
            System.out.println("It is a triangle");
        else
            System.out.println("It is not a triangle");

    }
}
