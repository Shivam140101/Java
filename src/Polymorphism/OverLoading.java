package Polymorphism;

public class OverLoading {
    void show(){
        System.out.println("Empty ");
    }
    void show(byte x ){
        System.out.println(" byte  x  "+x);
    }
    void show( short x ){
        System.out.println("short  x  "+x);
    }
    void show(int  x ){
        System.out.println("int  x  "+x);
    }
    void show(long x ){
        System.out.println("Long   x  "+x);
    }

    void show(float  x ){
        System.out.println("float  x  "+x);
    }
    void show(double x ){
        System.out.println("double   x  "+x);
    }
    static public void  main(String ...s) {
        OverLoading obj = new OverLoading();
        obj.show();
        obj.show(10);
        obj.show((byte)100);
        obj.show((short)1233);
        obj.show(76778L);
        obj.show(76887.767);
        obj.show(76800.767F);

    }

}
