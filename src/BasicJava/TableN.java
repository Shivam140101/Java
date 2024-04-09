package BasicJava;
import java.util.Scanner;
public class TableN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num ");
        int num = sc.nextInt();
        int i;
        i = 1;
        while(i <= 10) {
            System.out.println(num +" * "+i+ " = "+(num * i));
            i++;
        }


    }

}
