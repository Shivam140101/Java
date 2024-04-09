package BasicJava;
import java.util.Scanner;
public class SimpleIfStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Price of Book ");
        int price = sc.nextInt();
        System.out.println("The Price of Book "+price);
        boolean tf = price <= 550;
        System.out.println("The value  tf  "+tf);

        if(tf){
            //if(price <= 550){
            System.out.println("The book is Java Programming language");
            System.out.println("The Writer kaithy shera ");
            System.out.println("The Author TMH   ");
        }

        System.out.println("Out of if stmt ");

        System.out.println("End of main method");

    }
}
