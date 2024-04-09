package If_Else_Programming;

import java.util.Scanner;

public class Q14_Triangle_Valid {
    public static void main(String[] args) {
        //Write a program to input angles of a triangle and check whether triangle is valid or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st angle:- ");
        int ang1 = sc.nextInt();
        System.out.println("angle 1:- "+ang1);

        System.out.print("Enter 2nd angle:- ");
        int ang2 = sc.nextInt();
        System.out.println("angle 2:- "+ang2);

        System.out.print("Enter 3rd angle:- ");
        int ang3 = sc.nextInt();
        System.out.println("angle 3:- "+ang3);

        int total = ang1 + ang2 + ang3;

        if (total == 180 && ang1 >0 && ang2>0 && ang3>0)
            System.out.println("It is a triangle");
        else
            System.out.println("It is not a triangle");
    }
}
