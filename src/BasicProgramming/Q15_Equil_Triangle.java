package BasicProgramming;

import java.util.Scanner;

public class Q15_Equil_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to calculate area of an equilateral triangle.

        System.out.print("Enter the side of a equilateral triangle:- ");
        float side = sc.nextFloat();
        System.out.println("side:- "+side);

        float height = (float) Math.sqrt( (side*side) - ((side*side)/4f));

        float area = 1/2f * side * height;
        System.out.println("The area of equilateral triangle is:- "+area);
    }
}
