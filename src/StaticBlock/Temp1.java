package StaticBlock;
//static Data Member  static initi

public class Temp1 {
    static int x = 10;
    public static void main(String ...s){
        System.out.println("main method in Temp1 class  ");
        System.out.println("x = "+x);

    }
}

class Temp2{

    public static void main(String ...s){
        System.out.println("main method in Temp2 class  ");
        System.out.println("x = "+Temp1.x);

    }
}

class Temp3{

    public static void main(String ...s){
        System.out.println("main method in Temp3 class  ");
        System.out.println("x = "+Temp1.x);

    }
}


class Temp4{

    public static void main(String ...s){
        System.out.println("main method in Temp4 class  ");
        System.out.println("x = "+Temp1.x);

    }
}
