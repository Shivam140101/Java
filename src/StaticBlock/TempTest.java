package StaticBlock;
/*static Data Member Dynamic initialization
using static Block
=> The Static Block is always executed at
 class Loading time first only once in the
 life cycle of class
 => The static Block are used  to initialized
 the static data member Dynamically  */
import java.util.Scanner;
class Temp5{
    static int x;
    static{
        System.out.println("Start in Static Block ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of x ");
        x = sc.nextInt();
        System.out.println("End of  Static Block ");
    }
    public static void main(String ...s){
        System.out.println("main method in Temp5 class  ");
        System.out.println("x = "+x);
        System.out.println("x = "+x);
    }
}
public class TempTest {
    static void get(){
        System.out.println("get .....x = "+Temp5.x);
    }
    public static void main(String ...s){
        System.out.println("main method in TempTest class  ");
        System.out.println("x = "+Temp5.x);
        System.out.println("x = "+Temp5.x);
        get();

    }
}
