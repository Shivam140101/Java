package If_Else_Programming;

import java.util.Scanner;

public class Q8_Vowel_Conso {
    public static void main(String[] args) {
        //Write a program to input any alphabet and check whether it is vowel or consonant.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Alphabet:- ");
        char ch = sc.next().charAt(0);
        System.out.println("Alphabet:- "+ch);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("It is a Vowel");
        else
            System.out.println("It is a consonant");


    }
}
