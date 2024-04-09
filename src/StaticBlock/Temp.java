package StaticBlock;
//Non-static /Instance Data Member  static initi & dynamic Initi .

public class Temp {
    int x = 10;// compile time / static initi
    Temp(){  }
    void show(){
        System.out.println("x = "+x);

    }
    Temp(int x ){ // Dynamic Initi.
        this.x = x;
    }
    public static void main(String ...s){
        System.out.println("main method in Temp class  ");
        Temp obj = new Temp();
        obj.show();

        Temp obj1 = new Temp(100);
        obj1.show();

    }
}
