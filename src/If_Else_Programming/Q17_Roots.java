package If_Else_Programming;

import java.util.Scanner;

public class Q17_Roots {
    public static void main(String[] args) {
        //Write a program to find all roots of a quadratic equation.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input a:- ");
        float a = sc.nextFloat();
        System.out.println("input a:- "+a);

        System.out.print("Enter input b:- ");
        float b = sc.nextFloat();
        System.out.println("input b:- "+b);

        System.out.print("Enter input c:- ");
        float c = sc.nextFloat();
        System.out.println("input c:- "+c);

        float root1 , root2 , imaginary;
        float discriminant;

        discriminant = (b * b) - (4f * a * c );

        if (discriminant > 0){
            root1 = (float) (-b + Math.sqrt(discriminant)) / (2f*a);
            root2 = (float) (-b - Math.sqrt(discriminant)) / (2f*a);

            System.out.println("Two distinct and real roots are = "+root1+" , "+root2);
        }
        else if (discriminant==0){
            root1 = root2 = -b / (2f * a);
            System.out.println("Two equal and real roots = "+root1+" , "+root2);
        }
        else if (discriminant<0){
            root1 = root2 = -b / (2f * a);
            imaginary = (float) Math.sqrt(-discriminant) / (2/a);
            System.out.println("Two distinct complex roots = "+"("+root1+" , "+imaginary+")"+" , "+"("+root2+" , "+imaginary+")");
        }
    }
}
