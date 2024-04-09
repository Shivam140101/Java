package Polymorphism;

public class OverLoading2 {
    int  show(int x ,float y ,char ch){
        System.out.print("int  x  "+x);
        System.out.print("float  y  "+y);
        System.out.println("char ch  "+ch);
        return 100;
    }
    void show(char ch,float y, int  x ){
        System.out.print("\n\nchar ch  "+ch);
        System.out.print("float  y  "+y);
        System.out.println("int  x  "+x);

    }

    double  show(char ch,float y, int  x, double z  ){
        System.out.print("\n\nchar ch  "+ch);
        System.out.print("float  y  "+y);
        System.out.println(" int  x  "+x);
        System.out.println(" double  z  "+z);

        return z;

    }


    static public void  main(String ...s) {
        OverLoading2 obj = new OverLoading2();
        int a = obj.show(10,544.7666F,'A');
        System.out.println("returning value  int  a  "+a);

        double b =  obj.show('X',10.544f,7666,7676767.8667);
        System.out.println("returning value  double  b  "+b);

        obj.show('Z' ,565.76f,7878);
    }
}
