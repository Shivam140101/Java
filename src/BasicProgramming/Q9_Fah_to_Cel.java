package BasicProgramming;

import java.util.Scanner;

public class Q9_Fah_to_Cel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to enter temperature in Fahrenheit and convert to Celsius

        System.out.print("Enter temperature in Fahrenheit:- ");
        float temp = sc.nextFloat();
        System.out.println("temperature:- "+temp+"°F");

        float cel = (temp-32f)*5/9f;
        System.out.println("Temperature in celsius is:- "+cel+"°C");


    }
}
