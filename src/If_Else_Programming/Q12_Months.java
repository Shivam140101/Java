package If_Else_Programming;

import java.util.Scanner;

public class Q12_Months {
    public static void main(String[] args) {
        //Write a program to input month number and print number of days in that month.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number between 1 to 12:- ");
        int num  = sc.nextInt();
        System.out.println("Month number:- "+num);

        if (num==1)
            System.out.println("31 days :- January");
        else if (num==2)
            System.out.println("28 or 29 days:- February");
        else if (num==3)
            System.out.println("31 days :- March");
        else if (num==4)
            System.out.println("30 days :- April");
        else if (num==5)
            System.out.println("31 days :- May");
        else if (num==6)
            System.out.println("30 days :- June");
        else if (num==7)
            System.out.println("31 days :- July");
        else if (num==8)
            System.out.println("31 days :- August");
        else if (num==9)
            System.out.println("30 days :- September");
        else if (num==10)
            System.out.println("31 days :- October");
        else if (num==11)
            System.out.println("30 days :- November");
        else if (num==12)
            System.out.println("31 days :- December");
        else
            System.out.println("Invalid!!! enter again between 1 to 12");


    }
}


