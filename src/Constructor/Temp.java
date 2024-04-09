package Constructor;
/*1)Default Constructor=> The default Constructor can't take
 arguments it is initialized the value of Data Member only
 one time static initialization
  It is also initialized at run time using k.B.
  Scanner class object created in Constructor */
public class Temp {
    int x;
    int y;
    Temp(){
        System.out.println("Default Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        x =10;
        y =20;

        System.out.println("End of  Constructor ");
    }
    void show(){
        System.out.println("x  = "+this.x);
        System.out.println("y  = "+this.y);
    }
    public static void main(String  ...s){
        System.out.println("Start in main ");
        Temp obj = new Temp();
        System.out.println("The Ref. id of obj.  "+obj);
        obj.show();
        Temp obj1 = new Temp();
        System.out.println("The Ref. id of obj.  "+obj1);
        obj1.show();
        System.out.println("End of  main ");

    }
}
