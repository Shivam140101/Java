package Inheritence;
/*Method Overriding:=> Whenever Parent class & child having same
 member function then this concepts is Known as Method (Function)
 Overriding  The Child class override the Parent class Method

 The Always call the Child object overridden method of Child class
 The parent class Method call inside overridden of child class
 with the  help of super k.w.

*/
class Base3{
    void show(){
        System.out.println("Show Method from Base class ");
    }
    void out(){
        System.out.println("Out Method from Base class ");
    }

}

class Child4 extends  Base3{
    void show(){

        System.out.println("Show Method from Child class ");
        super.show();

    }
    void display(){
        System.out.println("display Method from Child class ");

    }
}
public class TestOverride {
    public static  void main(String  ...s){
        Child4 c1 = new Child4();
        c1.show();
        c1.out();
        c1.display();
    }
}
