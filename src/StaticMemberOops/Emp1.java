package StaticMemberOops;

public class Emp1 {
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
    public static void main(String ...s){
        System.out.println("Start in  main Method ");
        System.out.println("Company Name main :="+cname);
        //System.out.println("Name  main    :="+name);
        Emp1 e1 = new Emp1();
        System.out.println("The Reference Id of e1 obj. "+e1);
        e1.show();
        e1.getData("ABC",101,"Noida",10000);
        e1.show();
        System.out.println("Company Name main e1 :="+e1.cname);
        System.out.println("Name  main  e1   :="+e1.name);

        Emp1 e2 = new Emp1();
        System.out.println("The Reference Id of e2 obj.  "+e2);
        e2.show();
        e2.getData("xyz",201,"Delhi",15000);
        e2.show();

        Emp1 e3 = new Emp1();
        System.out.println("The Reference Id of e3 obj.  "+e3);
        e3.show();
        e3.getData("pqr",301,"Noida sec 16",18000);
        e3.show();

        //cname ="IBM";
        e3.cname="HCL";
        System.out.println("\nAfter update Company Name ");
        e1.show();
        e2.show();
        e3.show();

        e1.getData("Anjali",505,"Delhi",25000);
        System.out.println("\nAfter Update value of Data Member on e1 object ");
        e1.show();
        e2.show();
        e3.show();
        System.out.println("End of  main Method ");
    }
}
