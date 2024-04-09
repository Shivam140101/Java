package BasicProgramming;

import java.util.Scanner;

public class Q8_Cel_to_Fah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter temperature in Celsius and convert it into Fahrenheit.

        System.out.print("Enter temperature in Celsius:-" );
        float temp = sc.nextFloat();
        System.out.println("temperature:- "+temp+"°C");

        float fah = (temp*9/5f)+ 32f;
        System.out.println("temperature in Fahrenheit is :- "+fah+"°F");
    }
}
