package Inheritence;
class GreatGrandFather{
    int x= 5;
}
class GrandFather1 extends GreatGrandFather{
    int x= 10;
}
class Father2 extends GrandFather1{
    int x= 20;
}
class Child extends  Father2{
    int x = 30;
    void show(){
        System.out.println("Show Method from Child class  ");
        System.out.println("Child class x =  "+this.x);
        System.out.println("Father super  Data x =  "+super.x);
        System.out.println("((Father)this)  Data x =  "+((Father2)this).x);
        System.out.println("((GrandFather)this)  Data x =  "+((GrandFather1)this).x);
        System.out.println("((GreateGrandFather)this)  Data x =  "+((GreatGrandFather)this).x);
    }

}
public class MultiLevel2 {
    public static void main(String ...s){

        Child c1 = new Child();
        c1.show();

        System.out.println("\n\nMain Method from Child class  ");
        System.out.println("Child class x =  "+c1.x);
        System.out.println("((Father)this)  Data x =  "+((Father2)c1).x);
        System.out.println("((GrandFather)this) Data x ="+((GrandFather1)c1).x);
        System.out.println("((GreateGrandFather)this)  Data x =  "+((GreatGrandFather)c1).x);


    }
}
