package This;
/*Data Shadowing:=> Whenever class variable & local variable
 are same then this concepts is known as Data Shadowing

  The Data Shadowing Problem solve with help of "this " K.w.
 */
public class Temp1 {
    int x =10;
    void show(int y ){
        int x =30;
        System.out.println("The Ref id of this k.w  "+this);
        System.out.println("local x = "+x);
        System.out.println("class x = "+this.x);
        System.out.println("agrs y = "+y);
    }
    void get(int x){
        this.x = x;
    }
    public static void main(String ...s){
        Temp1 obj  = new Temp1();
        System.out.println("The Ref id of obj  "+obj);
        System.out.println("class x main = "+obj.x);
        obj.show(20);

        Temp1 obj1  = new Temp1();
        System.out.println("The Ref id of obj1  "+obj1);
        System.out.println("class x main = "+obj1.x);
        obj1.show(20);

        System.out.println("After initi. each object  ");
        obj.get(100);
        obj1.get(200);

        obj.show(60);
        obj1.show(70);
        //System.out.println("The Ref id of this k.w  "+this);

    }
}
/*"this" k.w. in C++ is pointer variable it kept the address
  of current Object
 "this" k.w. in java is Reference variable  hold the Reference
   id of current Object
Note: => By default "this" k.w used by the compile when Data
Shadowing not become our programs
 If the Data Shadowing become in our programs " this " k.w
 implemented  by programmer

 why used this k.w. ?
 Whenever class variable & function parameter & constructor
 parameter or function & constructor local declared variable
are same then used this k.w.

==>*** this k.w it is also used call one constructor from
another
=> The this k.w. not used in static function (Method)
*/