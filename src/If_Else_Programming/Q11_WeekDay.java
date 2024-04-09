package If_Else_Programming;

import java.util.Scanner;

public class Q11_WeekDay {
    public static void main(String[] args) {
        //Write a program to input week number and print week day.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number from 1 to 7:- ");
        int num = sc.nextInt();
        System.out.println("Week number:- "+num);

        if (num==1)
            System.out.println("Monday");
        else if (num==2)
            System.out.println("Tuesday");
        else if (num==3)
            System.out.println("Wednesday");
        else if (num==4)
            System.out.println("Thursday");
        else if (num==5)
            System.out.println("Friday");
        else if (num==6)
            System.out.println("Saturday");
        else if (num==7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid!!! enter again between 1 to 7");

    }
}
