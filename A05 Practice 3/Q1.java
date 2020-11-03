import java.util.*;
interface Shape
{
    double pi=3.14;
}

class circle implements Shape
{
    double area;
    void areacircle(double r){
        
        area=pi*r*r;
        System.out.println("Area ="+area);
    }
}

class Rectangle implements Shape
{
    double area;
    void areaRectangle(double l, double b){
        area=l*b;
         System.out.println("Area ="+area);
    }
}

public class D10q1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double r,l,b;
        circle o1 = new circle();
           System.out.println("Enter radius:");
           r=sc.nextDouble();
           o1.areacircle(r);
           
           
        Rectangle o2 =new Rectangle();
            System.out.println("Enter length:");
            l=sc.nextDouble();
            System.out.println("Enter breadth:");        
            b=sc.nextDouble();
            o2.areaRectangle(l, b);
    }
    
}
