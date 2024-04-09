package Oops;

public class Emp {
    String name;
    int eid;
    String address;
    int salary;
    void getData(String n ,int id, String addr,int sal){
        name = n;
        eid = id;
        address = addr;
        salary = sal;
    }
    void show(){
        System.out.println("\nDetails of Employe ");
        System.out.println("Name:=    "+name);
        System.out.println("Id:=      "+eid);
        System.out.println("Address:= "+address);
        System.out.println("Salary := "+salary);
    }
    public static void main(String ...s){
        System.out.println("Start in  main Method ");
        Emp e1 = new Emp();
        System.out.println("The Reference Id of e1 obj. "+e1);
        e1.show();
        e1.getData("ABC",101,"Noida",10000);
        e1.show();

        Emp e2 = new Emp();
        System.out.println("The Reference Id of e2 obj.  "+e2);
        e2.show();
        e2.getData("xyz",201,"Delhi",15000);
        e2.show();


        Emp e3 = new Emp();
        System.out.println("The Reference Id of e3 obj.  "+e3);
        e3.show();
        e3.getData("pqr",301,"Noida sec 16",18000);
        e3.show();
        System.out.println("\nAfter initi. value of Data Member on  each object ");
        e1.show();
        e2.show();
        e3.show();

        e1.getData("Anjali",505,"Delhi",25000);
        System.out.println("\nAfter Update value of Data Member on e1 object ");
        e1.show();
        e2.show();
        e3.show();

        e2 = new Emp();
        System.out.println("The Reference Id of  current object  to Ref. var e2  "+e2);
        e2.show();
        e2.getData("Rohit",601,"N-Delhi",30000);
        e2.show();

        e1.show();
        e3.show();

        System.out.println("=====================================");

        e3 = new Emp();
        System.out.println("The Reference Id of  current object  to Ref. var e3 "+e3);
        e3.show();
        e3.getData("Shivam",909,"Panchkula",35000);
        e3.show();


        System.out.println("End of  main Method ");
    }


}
