package Loop_Que;

//    1.Write a Java program to print all natural numbers from 1 to n. - using while loop

import java.util.Scanner;

public class Q1_print_No_1_to_n {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to "+num+" are :- ");
        int i=1;
        while (i<=num){
            System.out.println(i);
            i++;
        }
    }
}
