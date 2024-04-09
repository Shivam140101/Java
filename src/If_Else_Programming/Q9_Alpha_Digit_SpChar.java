package If_Else_Programming;

import java.util.Scanner;

public class Q9_Alpha_Digit_SpChar {
    public static void main(String[] args) {
        //Write a program to input any character and check whether it is alphabet, digit or special character

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character:- ");
        char ch = sc.next().charAt(0);
        System.out.println("Character:- "+ch);

        if (ch>='a' && ch<='z' || ch >='A' && ch<='Z')
            System.out.println(ch+" is an Alphabet");
        else if (ch>= '0' && ch<='9')
            System.out.println(ch+" is a digit");
        else
            System.out.println(ch+" is a special character");
    }
}
