package BasicJava;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num(Range) ");
        int num = sc.nextInt();
        System.out.println("The Range is "+num);
        int i,j=1;
        i = 2;
        while(i <= num) {
            j=1;
            while(j <= 10) {
                System.out.print("  "+(i *j));
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }

        System.out.println("End of main");

    }
}
