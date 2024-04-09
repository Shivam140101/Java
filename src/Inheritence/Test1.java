package Inheritence;
/*Data Hiding:=> Whenever Parent class & Child class having the
same Data Member then this Concepts is Known as Data Hiding
 ==> The Data Hiding Problem solve with the help of super k.w. */

class Base1{
    int x= 20;
}
class Child3 extends  Base1{
    int x = 30;
    void show(int x){
        System.out.println("Show Method from Child class  ");
        System.out.println("parent Data x =  "+super.x);
        System.out.println("Child class x =  "+this.x);
        System.out.println("Local var x =  "+x);

        //System.out.println("The Ref is super =  "+super);
        System.out.println("The Ref is this =  "+this);
    }

}
public class Test1 {
    public static void main(String ...s){

        Child3 c1 = new Child3();
        c1.show(40);
    }
}
/*
How super call the parent class object ?
  The super is the part of child class object which memory
  space used by the parent Data Member this particular Ref. id
  that memory kept in super

  When Data hiding become in programs then used the super
call the  parent Data Member & also Member Function

Note : => super & this k.w not used in Static methods
*/