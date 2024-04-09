package BasicProgramming;

import java.util.Scanner;

public class Q14_Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Write a program to enter base and height of a triangle and find its area.

        System.out.print("Enter base of a triangle:- ");
        float base = sc.nextFloat();
        System.out.println("base:- "+base);

        System.out.print("Enter height of a triangle:- ");
        float height = sc.nextFloat();
        System.out.println("height:- "+height);

        float area = 1/2f * base * height;
        System.out.println("The area of triangle is:- "+area);
    }
}
