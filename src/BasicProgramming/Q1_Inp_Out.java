package BasicProgramming;

import java.util.Scanner;
public class Q1_Inp_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to perform input/output of all basic data types
        System.out.println("Enter value of int datatype:-  ");
        int a = sc.nextInt();
        System.out.println("The value of int datatype is :- "+a);

        System.out.println("Enter the value of short datatype:- ");
        short b = sc.nextShort();
        System.out.println("The value of short datatype is:- "+b);

        System.out.println("Enter the value of byte datatype:- ");
        byte c = sc.nextByte();
        System.out.println("The value of byte datatype is:- "+c);

        System.out.println("Enter the value of long datatype:- ");
        long d = sc.nextLong();
        System.out.println("the value of long datatype is:- "+d);

        System.out.println("Enter the value of float datatype:- ");
        float e = sc.nextFloat();
        System.out.println("The value of float datatype is:- "+e);

        System.out.println("Enter the value of double Datatype:- ");
        double f = sc.nextDouble();
        System.out.println("The value of double datatype is:- "+f);

        System.out.println("Enter the value of boolean datatype:- ");
        boolean g = sc.nextBoolean();
        System.out.println("The value of boolean datatype is:- "+g);

        System.out.println("Enter the value of char datatype:- ");
        char ch = sc.next().charAt(0);
        System.out.println("The value of char datatype is:- "+ch);


    }
}
