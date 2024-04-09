package Constructor;
/*Copy Constructor:=> The copy value of data Member one
object into another  this is support in c++
In Java Copy  Constructor are not available
   This work  done with the help parameterized Constructor
  */
public class Temp2 {
    int x;
    int y;

    Temp2(){
        System.out.println("Defaut Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        x =10;
        y =20;
    }
    Temp2(int x,int y){
        System.out.println("parameterized Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        this.x = x ;
        this.y = y;
    }

    Temp2(Temp2 t1){
        System.out.println("Copy Constructor ... ");
        System.out.println("The Ref. id of this kw.  "+this);
        System.out.println("The Ref. id of t1   "+t1);
        this.x = t1.x;
        this.y = t1.y;
    }
    void show(){
        System.out.println("x  = "+this.x);
        System.out.println("y  = "+this.y);
    }
    public static void main(String  ...s){
        System.out.println("Start in main ");
        Temp2 obj = new Temp2();
        System.out.println("The Ref. id of obj.  "+obj);
        obj.show();

        Temp2 obj1 = new Temp2(100,200);
        System.out.println("The Ref. id of obj1.  "+obj1);
        obj1.show();

        Temp2 obj2 = new Temp2(obj1);
        System.out.println("The Ref. id of obj2.  "+obj2);
        obj2.show();

        System.out.println("End of  main ");
    }
}
