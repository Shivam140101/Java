package BasicJava;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y =0,choice;
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Rem");
        System.out.print("Enter a choice ");
        choice = sc.nextInt();
        if(choice <=5 && choice !=0) {
            System.out.print("Enter a value of  x  ");
            x = sc.nextInt();
            System.out.print("Enter a value of  y  ");
            y = sc.nextInt();
            System.out.println(" x=  "+x+"   y = "+y);
        }

        switch(choice) {
            case 1:
                System.out.println("Sum = "+(x +y));
                break;
            case 2:
                System.out.println("Sub = "+(x - y));
                break;
            default:
                System.out.println("Invalid Choice  ");
                break;
            case 3:
                System.out.println("Mul = "+(x * y));
                break;

            case 4:
                System.out.println("Div = "+(float)x/y);
                break;
            case 5:
                System.out.println("Rem = "+(x % y));
                break;
      /*default:
          System.out.println("Invalid Choice  ");
          break; */

        }
        System.out.println("Out of Switch-case stmt ");
        System.out.println("End of main ");
    }
}
