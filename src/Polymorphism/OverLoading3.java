package Polymorphism;

public class OverLoading3 {
    void  show(int x , long y ){
        System.out.println("int  x  "+x+"   Long   y "+y);
    }
    void  show(long x ,int y ){
        System.out.println("long  x  "+x+"  int   y "+y);
    }
    static public void  main(String ...s) {
        OverLoading3 obj = new OverLoading3();
        //obj.show(10,20); // Error   ambiguous 
        obj.show(100,200L);

        obj.show(10001L,20022);
    }
}
