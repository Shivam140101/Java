package If_Else_Programming;

import java.util.Scanner;

public class Q7_Alphabet {
    public static void main(String[] args) {
        //Write a C program to check whether a character is alphabet or no
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:- ");
        char ch = sc.next().charAt(0);
        System.out.println("Character:- "+ch);

        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            System.out.println("It is an Alphabet");
        else
            System.out.println("It is not an Alphabet");
    }
}
