package StaticMemberOops;

class Emp3{
    String name;
    int eid;
    String address;
    int salary =100;
    static String cname="TCS";
    void getData(String n ,int id, String addr,int sal){
        name = n;
        eid = id;
        address = addr;
        salary = sal;
    }
    void show(){
        System.out.println("\nDetails of Employe ");
        System.out.println("Name      :="+name);
        System.out.println("Id        :="+eid);
        System.out.println("Address   := "+address);
        System.out.println("Salary    := "+salary);
        System.out.println("Company Name:="+cname);
    }
    static void companyChange(String cn){
        cname = cn;
    }
}
public class EmpTest {
    public static void main(String ...s){
        System.out.println("Start in  main Method EmpTest Class ");
        System.out.println("Company Name main :="+Emp3.cname);

        Emp3  e1  = new Emp3();
        System.out.println("The Reference Id of e1 obj. "+e1);
        e1.getData("ABC",101,"Noida",10000);
        e1.show();
        System.out.println("Company Name main e1 :="+e1.cname);
        System.out.println("Name  main  e1   :="+e1.name);

        Emp3 e2 = new Emp3();
        System.out.println("The Reference Id of e2 obj.  "+e2);

        e2.getData("xyz",201,"Delhi",15000);
        e2.show();

        Emp3 e3 = new Emp3();
        System.out.println("The Reference Id of e3 obj.  "+e3);

        e3.getData("pqr",301,"Noida sec 16",18000);
        e3.show();

        Emp3.companyChange("IBM");
        //e3.companyChange("HCL");
        System.out.println("\nAfter update Company Name ");
        e1.show();
        e2.show();
        e3.show();
        System.out.println("End of  main Method ");
    }
}
