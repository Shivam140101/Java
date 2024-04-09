package Inheritence;
class GrandFather{
    int x= 10;
}
class Father extends GrandFather{
    int x= 20;
}
class child extends  Father{
    int x = 30;
    void show(){
        System.out.println("Show Method from Child class  ");
        System.out.println("Child class x =  "+this.x);
        System.out.println("Father super  Data x =  "+super.x);
        System.out.println("((Father)this)  Data x =  "+((Father)this).x);
        System.out.println("((GrandFather)this)  Data x =  "+
                ((GrandFather)this).x);
    }

}
public class MultiLevel1 {
    public static void main(String ...s){

        child c1 = new child();
        c1.show();

        System.out.println("\n\nMain Method from Child class  ");
        System.out.println("Child class x =  "+c1.x);
        System.out.println("((Father)this)  Data x =  "+((Father)c1).x);
        System.out.println("((GrandFather)this) Data x ="+
                ((GrandFather)c1).x);


    }
}
