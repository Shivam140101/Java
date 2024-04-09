package BasicJava;
public class TestStringConcat {
    public static void main(String[] args) {
            System.out.println("Hello");
            System.out.println("Hello".length());
            int len =   "Hello".length();
            System.out.println(len);
            String  s1="Good";
            len =   s1.length();
            System.out.println(len);
            String s2 =null;
            System.out.println(s2);
            s2 = s1+" Evening" +4+"Pm"+ "BasicJava " +10+ 20 + 40+" Batch"+ 30;
            System.out.println(s2);

            String s3 = 10+ 20+ 30+" Hello" + "Hi" + 50+ 70;
            System.out.println(s3);
            System.out.println(10+20+40);

            System.out.println(10+20+40+"Hello"+40 +60);
            System.out.println(10+20+40+"Hello"+(40 +60));
            System.out.println("The Integer value is "+10+20+40+"Hello"+(40 +60));
    }
}
