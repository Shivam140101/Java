package generic1;

public class test <T> {

    T a;

    public test(T a){
        this.a = a;
    }

    void show(){
        Class c1 = a.getClass();
        System.out.println(c1.getName()+"  "+a);
    }

    public static void main(String[] args) {

        System.out.println("Intefer obj.......");
        test <Integer> iobj = new test<Integer>(10);
        iobj.show();

        System.out.println("Float obj.......");
        test<Float> fobj = new test<Float>(12.34f);
        fobj.show();

        System.out.println("String obj............");
        test<String> sobj = new test<String>("AAAA");
        sobj.show();

        System.out.println("Doubel obj................");
        test <Double> dobj = new test<>(12.33);
        dobj.show();

    }
}
