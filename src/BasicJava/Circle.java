package BasicJava;
import java.util.*;
public class Circle {
    
        public static void main(String[] args) {
            float radius=0.0f,dim=0.0f,area=0.0f,cir=0.0f;
            Scanner sobj = new Scanner(System.in);
            System.out.print("Enter radius of a circle:=  ");
            radius = sobj.nextFloat();
            System.out.println("The Radius of a circle:=  "+radius);

            dim = 2 * radius;
            System.out.println("The Diameter of a circle:=  "+dim);

            cir = 2 * 3.14f * radius;
            System.out.println("The Circumference of a circle:=  "+cir);

            area  = 3.14f * radius * radius;
            System.out.println("The Area  of a circle:=  "+area);


        }
}

