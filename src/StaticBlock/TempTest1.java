package StaticBlock;
class Demo{
    void show(){
        System.out.println("Show Method from Demo class ");
    }
}


class Temp6{

    static Demo d = null;;
    static{
        System.out.println("Start in Static Block ");
        d = new Demo();

        System.out.println("End of  Static Block ");
    }
    public static void main(String ...s){
        System.out.println("main method in Temp6class  ");
        System.out.println("The Ref. var.  "+d);
        System.out.println("The Ref. var.  "+d);
        d.show();
    }
}

public class TempTest1 {
    public static void main(String ...s){
        System.out.println("main method in TempTest1 class  ");
        System.out.println("The Ref. var.  "+Temp6.d);
        System.err.println("The Ref. var.  "+Temp6.d);
        Temp6.d.show();
        //System.out.println()

    }
}
