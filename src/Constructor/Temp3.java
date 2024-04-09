package Constructor;
/*
The Constructor can't have any return type  if you add
the return type of then java compiler give an error ot not ?

No Give any In java Method name same as class Name are allowed
But it is not  done this type work  Ambiguity problem of the
programmer level not compiler
*/
public class Temp3 {
    int x;
    int y;

    Temp3(){
        System.out.println("Defaut Constructor ... ");
        x =10 ;y =20;
    }
    Temp3(int x,int y){
        System.out.println("parameterized Constructor ... ");
        this.x = x ;
        this.y = y;
    }

    void Temp3( ){
        System.out.println("The Method Name same as Class Name  ");
    }
    void show(){
        System.out.println("x  = "+this.x);
        System.out.println("y  = "+this.y);
    }
    public static void main(String  ...s){
        System.out.println("Start in main ");

        Temp3 obj = new Temp3();
        obj.show();
        obj.Temp3();

        Temp3 obj1 = new Temp3(100,200);
        obj1.show();
        obj1.Temp3();

        new Temp3().show();
        new Temp3().Temp3();

        new Temp3(3000,4000).Temp3();

        System.out.println("End of  main ");
    }
}
