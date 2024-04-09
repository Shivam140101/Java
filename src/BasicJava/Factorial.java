package BasicJava;

import java.util.Scanner;

    public class Factorial {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of num ");
            int num = sc.nextInt();
            System.out.print("The value is   "+num);
            int fact =1;

            while(num !=0) {
                fact = fact * num;
                num--;

            }
            System.out.println("  and Factorial   "+fact);
        }
}
