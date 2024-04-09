package Constructor;
/*Constructor Chaining :=> Calling one Constructor from another
 is called Constructor Chaining
  Note: The Constructor call must be first statement in constructor
  by this() way */
public class Temp4 {
    Temp4(){
        this(10);
        System.out.println("Default Constructor ... ");

        //this(10); error: call to this must be first statement in constructor
    }
    Temp4(int x,int y){
        this("Good Evening 4pm java java Batch");
        System.out.print("x  = "+x);
        System.out.println("y  = "+y);
    }

    Temp4(int x  ){
        this(100,200);
        System.out.println("x  = "+x);
    }
    Temp4( String str  ){
        System.out.println("String  str  "+str);
    }
    public static void main(String  ...s){
        System.out.println("Obj............");

        new Temp4();

        System.out.println("End of  main ");
    }
}
