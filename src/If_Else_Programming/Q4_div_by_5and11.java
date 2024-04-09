package If_Else_Programming;

import java.util.Scanner;

public class Q4_div_by_5and11 {
    public static void main(String[] args) {
        //Write a program to check whether a number is divisible by 5 and 11 or not.

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = sc.nextInt();
        System.out.println("Your number:-  "+num);

        if (num%5==0 && num%11==0)
            System.out.println("Number is divisible by 5 and 11");
        else
            System.out.println("Number is not divisible by 5 and 11");
    }
}
