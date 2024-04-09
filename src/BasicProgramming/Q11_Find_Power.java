package BasicProgramming;

import java.util.Scanner;

public class Q11_Find_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a program to find power of any number x ^ y.

        System.out.print("Enter the value of x:-");
        int x = sc.nextInt();
        System.out.println("x:- "+x);

        System.out.print("Enter the value of y:- ");
        int y = sc.nextInt();
        System.out.println("y:- "+y);

        int pow = (int)Math.pow(x,y);
        System.out.println("The power of "+x+"^"+y+" is:- "+pow);


    }

}
