package Loop_Que;


// 2.Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.Scanner;

public class Q2_N_to_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = sc.nextInt();

        System.out.println("Number form "+num+" to 1 are:- ");
        int i=1;
        while (num>=i){
            System.out.println(num);
            num--;
        }
    }
}
