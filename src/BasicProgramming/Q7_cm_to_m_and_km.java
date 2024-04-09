package BasicProgramming;

import java.util.Scanner;

public class Q7_cm_to_m_and_km {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter length in centimeter and convert it into meter and kilometer.
        System.out.print("Enter length in cm:- ");
        int len = sc.nextInt();
        System.out.println("length is:- "+len+"cm");

        double meter = len/100;
        System.out.println("The length in meter is:- "+meter+"m");

        double kilo = len/100000;
        System.out.println("The length in kilometer is:- "+kilo+"km");

    }
}
