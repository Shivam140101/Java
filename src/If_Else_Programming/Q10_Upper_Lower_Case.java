package If_Else_Programming;

import java.util.Scanner;

public class Q10_Upper_Lower_Case {
    public static void main(String[] args) {
        //Write a program to check whether a character is uppercase or lowercase alphabet.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet:- ");
        char ch = sc.next().charAt(0);
        System.out.println("Alphabet:- "+ch);

        if (ch>='a' && ch<='z')
            System.out.println("Alphabet is in lowercase");
        else if (ch>='A' && ch<='Z')
            System.out.println("Alphabet is in uppercase");
        else
            System.out.println("not an alphabet");
    }
}
