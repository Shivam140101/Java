package StaticBlock;
//System.out.println();
/*System is class in Java  it is kept the Reference
variable of  all the H/w Resource.
 System is class & out is Reference variable of
 PrintStream  class  its is declare in System class as
 static then its write System.out.
  When we System.out to initi. object of PrintStream
  class to the Reference variable out  using
  static Block or setOut()  method then println method
  of PrintStream class by using Reference var. out
  */
class PrintStream1{
    void println(String str){
        System.out.println(str);
    }
}
class System1{
    static PrintStream1 out = null;;
    static{
        out = new PrintStream1();
    }
}
public class TempTest2 {
    public static void main(String ...s){
        System1.out.println("This is ex. of sop ");
    }
}
