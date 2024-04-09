package Inheritence;
/*Implementation of Inheritance:=> All the Data Member
& Member function of the Parent class are part of the
Child class object if they are not private   */
class Base{
    int x;
    int y;
    void show(){
        System.out.println("Show Method from Base class  ");
        System.out.println("x =  "+x);
        System.out.println("y =  "+y);
    }

}
class child1 extends  Base{
    void getData(int x ,int y){
        System.out.println("getData Method from Child class  ");
        this.x = x;
        this.y = y;
    }

}
public class Test {
    public static void main(String ...s){
        Base  b1 = new Base() ;
        b1.show();
        //b1.getData(100,200);
        child1 c1 = new child1();
        c1.show();
        c1.getData(100,200);
        c1.show();
    }

}
