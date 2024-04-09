package Loop_Que;

// 9.	Write a Java program to print multiplication table of any number.

import java.util.Scanner;

public class Q9_Table_of_Any {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int limit = 10;

        System.out.println("Multiplication table of " + num + ":");

        for (int i = 1; i <= limit; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }

}
