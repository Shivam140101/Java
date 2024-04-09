package JVM_Archi;

public class Temp{
    int x;
    int y ;
    static int z=101;
    void getData(int a,int b){
        x = a;
        y = b;
    }
    void show(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

    }
    public static void main(String ...s){
        System.out.println("main Method.... ");

        Temp obj = null; //Reference variable
        System.out.println("The value of Ref var null  "+obj);
        obj = new Temp();
        System.out.println("The value of Ref var. is Ref. id obj  "+obj);
        obj.show();
        obj.getData(100,200);
        obj.show();

        Temp obj1 = new Temp();
        System.out.println("The value of Ref var. is Ref. id obj1  "+obj1);
        obj1.show();
        obj1.getData(400,500);

        obj1.show();

        z = 404;
        System.out.println("The after changed value of z   ");
        obj.show();
        obj1.show();

        obj.getData(600,800);
        System.out.println("The after changed value of obj  ");
        obj.show();
        obj1.show();

    }
}
