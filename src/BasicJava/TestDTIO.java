package BasicJava;
import java.util.Scanner;
public class TestDTIO {
    public static void main(String ...s)	{
        System.out.println("The ex. of IO Primitive D.T.");
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter value of boolean D.T.:=>   ");
        boolean tf = sobj.nextBoolean();
        System.out.println("The value of boolean D.T.  "+tf);

        System.out.print("Enter value of byte D.T.:=>   ");
        byte a  = sobj.nextByte();
        System.out.println("The value of byte D.T.  "+a);

        System.out.print("Enter value of short D.T.:=>   ");
        short b  = sobj.nextShort();
        System.out.println("The value of short D.T.  "+b);

        System.out.print("Enter value of int D.T.:=>   ");
        int c  = sobj.nextInt();
        System.out.println("The value of int D.T.  "+c);

        System.out.print("Enter value of long D.T.:=>   ");
        long x  = sobj.nextLong();
        System.out.println("The value of long D.T.  "+x);

        System.out.print("Enter value of float D.T.:=>   ");
        float y  = sobj.nextFloat();
        System.out.println("The value of float D.T.  "+y);

        System.out.print("Enter value of double D.T.:=>   ");
        double  z  = sobj.nextDouble();
        System.out.println("The value of double D.T.  "+z);

        System.out.print("Enter char D.T value  :  ");
        char ch=  sobj.next().charAt(0);
        System.out.println("The char D.T value is  ch =  "+ch);
    }

}

