package StaticBlock;

public class Temp7 {
    int x = 10;
    Temp7(){  }
    void show(){
        System.out.println("x = "+x);

    }
    Temp7(int x ){
        this.x = x;
    }
    static{
        System.out.println("Start in Static Block ");
        Temp7 obj = new Temp7();
        obj.show();

        Temp7 obj1 = new Temp7(100);
        obj1.show();

        System.out.println("End of  Static Block ");
    }
    public static void main(String ...s){
	System.out.println("main method in Temp7 class  ");
	Temp7 obj = new Temp7();
	obj.show();

	Temp7 obj1 = new Temp7(100);
	obj1.show();

  }
}
