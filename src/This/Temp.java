package This;
/*Data Shadowing:=> Whenever class variable & local variable are
same then this concepts is known as Data Shadowing */
//Need for this k.w.
public class Temp {
    int x =10;
    void show(int y ,Temp t1 ){
        int x =30;
        System.out.println("The Ref id of t1  "+t1);
        System.out.println("local x = "+x);
        System.out.println("class t1.x = "+t1.x);
        System.out.println("agrs y = "+y);
        System.out.println("The Ref id of this k.w  "+this);
    }
    public static void main(String ...s){
        Temp obj  = new Temp();
        System.out.println("The Ref id of obj  "+obj);
        System.out.println("class x main = "+obj.x);
        obj.show(20,obj);

        Temp obj1  = new Temp();
        System.out.println("The Ref id of obj1  "+obj1);
        System.out.println("class x main = "+obj1.x);
        obj1.show(20,obj1);

    }
}
/*
30 10  30
10 10  30
20 20  20
*/