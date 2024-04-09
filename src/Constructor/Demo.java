package Constructor;
import java.util.Scanner;
public class Demo {
    int x;
    int y;
    Demo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Default Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        System.out.print("Enter a value of x ");
        this.x = sc.nextInt();
        System.out.print("Enter a value of y ");
        y = sc.nextInt();

        System.out.println("End of  Constructor ");
    }
    void show(){
        System.out.println("x  = "+this.x);
        System.out.println("y  = "+y);
    }
    public static void main(String  ...s){
        System.out.println("Start in main ");
        Demo obj = new Demo();
        System.out.println("The Ref. id of obj.  "+obj);
        obj.show();
        Demo obj1 = new Demo();
        System.out.println("The Ref. id of obj.  "+obj1);
        obj1.show();

        System.out.println("End of  main ");

    }
}
