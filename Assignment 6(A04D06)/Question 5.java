abstract class Sh
{
    abstract public void area();
}
class Cir extends Sh
{
    int r;
    double a;
    Cir()
    {
        r=7;
    }
    public void area()
    {
        a=(3.14)*(r*r);
        System.out.println("Area of circle : "+a);
    }
}
class Rect extends Sh
{
    int l,b;
    double a;
    Rect()
    {
        l=7;
        b=17;
    }
    public void area()
    {
        a=l*b;
        System.out.println("Area of rectangle : "+a);
    }
}
public class Caller5
{
    public static void main(String args[])
    {
        Sh ob=new Cir();
        ob.area();
        Sh ob1=new Rect();
        ob1.area();
    }    
}
