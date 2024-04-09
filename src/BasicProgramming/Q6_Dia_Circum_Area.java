package BasicProgramming;

import java.util.Scanner;

public class Q6_Dia_Circum_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter radius of a circle and find its diameter, circumference and area.

        System.out.println("Enter radius of circle:- ");
        float r = sc.nextFloat();
        System.out.println("radius:- "+r);

        float dia = 2*r;
        System.out.println("The diameter is:- "+dia);

        float cir = 2 * 3.14f * r;
        System.out.println("The circumference is:- "+cir);

        float area = 3.14f * r * r;
        System.out.println("The area is:- "+area);

    }
}
