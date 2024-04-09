package BasicJava;
import java.util.Scanner;
public class FactorialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num(Range)");
        int num = sc.nextInt();
        System.out.println("The Range is   "+num);
        int fact =1,i,j;
        i= 1;
        while(i <=num) {
            j= i;
            fact =1;
            while(j !=0) {
                fact = fact *j;
                j--;
            }
            System.out.println("The value is "+i+" and Factorial is   "+fact);
            i++;
        }

    }

}
