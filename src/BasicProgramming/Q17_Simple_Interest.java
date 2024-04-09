package BasicProgramming;

import java.util.Scanner;

public class Q17_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter P, T, R and calculate Simple Interest.

        System.out.print("Enter Principle:- ");
        int pri = sc.nextInt();
        System.out.println("Principle:- "+pri);

        System.out.print("Enter time:- ");
        int time = sc.nextInt();
        System.out.println("Time:- "+time);

        System.out.print("Enter rate:- ");
        int rate = sc.nextInt();
        System.out.println("Rate:- "+rate);

        float SI = ((pri * time * rate)/100f);
        System.out.println("Simple Interest is:- "+SI);


    }
}
