package Constructor;
/*Parameterized Constructor it initialized the value of Data
Member at runtime  The use of parameterized vary the value
of Data member of each object
  The with arguments are called parameterized Constructor */
import java.util.Scanner;
public class Temp1 {
    int x;
    int y;
    //Temp1(){  }
    Temp1(){
        System.out.println("Defaut Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        x =10;
        y =20;
    }
    Temp1(int x,int y){
        System.out.println("parameterized Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        this.x = x ;
        this.y = y;
    }
    void show(){
        System.out.println("x  = "+this.x);
        System.out.println("y  = "+this.y);
    }
    public static void main(String  ...s){
        System.out.println("Start in main ");
        Temp1 obj = new Temp1();
        System.out.println("The Ref. id of obj.  "+obj);
        obj.show();

        Temp1 obj1 = new Temp1(100,200);
        System.out.println("The Ref. id of obj2.  "+obj1);
        obj1.show();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of x ");
        int x = sc.nextInt();
        System.out.print("Enter a value of y ");
        int y  = sc.nextInt();

        Temp1 obj2 = new Temp1(x,y);
        System.out.println("The Ref. id of obj2.  "+obj2);
        obj2.show();

        new Temp1().show(); // Anonaymous object
        new Temp1(3000,6000).show(); // Anonaymous object
        System.out.println("End of  main ");
    }
}
/*
The use of Anonymous object call the method  only one time
The Anonymous object can't be refers to any Reference var. for
that reference id .
*/
