package BasicJava;

public class IncreDecreOp {
    public static void main(String[] args) {
        int m = 5 , a,n = 6,b, p= 7,c,q =8,d;

        //postfix
        a =  m++; // a = 5 m = 6
        System.out.println("a =  "+a+"   m = "+m);
        b = n--;  //  b = 6 n = 5
        System.out.println("b =  "+b+"   n = "+n);

        //Prefix
        c = ++p; // p  = 8  c = 8
        System.out.println("p =  "+p+"   c = "+c);
        d = --q;   // q  = 7 d = 7
        System.out.println("q =  "+q+"   d = "+d);
//Write a C program to find power of any number x ^ y.

        double power = Math.pow(5, 3);
        System.out.println("5 ^ 3  = "+power);
        int pw = (int)Math.pow(7, 3);
        System.out.println("7 ^ 3 = "+pw);
        System.out.println("8^ 2  = "+Math.pow(8, 2));



    }

}
